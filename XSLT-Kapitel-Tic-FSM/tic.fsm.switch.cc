void Tic::handleMessage(cMessage *msg) {

    FSM_Switch(fsm)
    {

    case FSM_Exit(INIT):
        FSM_Goto(fsm, ModifyingMsg);
        break;

    case FSM_Enter(ModifyingMsg):
        //entry code
        scheduleAt(simTime() + 1.0, ticEvent);
        break;

    case FSM_Exit(ModifyingMsg):
        if (msg == ticEvent) {
            FSM_Goto(fsm, SendingMsg);
        }
        break;

    case FSM_Exit(ReceivingMsg):
        //exit code
        transferredMsg = msg;
        FSM_Goto(fsm, ModifyingMsg);
        break;

    case FSM_Exit(SendingMsg):
        //exit code
        send(transferredMsg, "out");
        transferredMsg = NULL;
        FSM_Goto(fsm, WaitingForMsg);
        break;

    case FSM_Enter(WaitingForMsg):
        break;

    case FSM_Exit(WaitingForMsg):
        if (strcmp(msg->getName(), "transferredMsg") == 0) {
            EV << msg->getName() << endl;
            FSM_Goto(fsm, ReceivingMsg);
        }
        break;

    }
}