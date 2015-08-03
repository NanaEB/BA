/*
 * tic_fsm.cc
 *
 *  Created on: 26.05.2015
 *      Author: Nana
 */

#define FSM_DEBUG

#include <stdio.h>
#include <string.h>
#include <omnetpp.h>

class Tic: public cSimpleModule {

    // FSM and its states
    cFSM tic_fsm;
    enum {
        g = 0,
        WAIT_SEND = FSM_Steady(1),
        WAIT_RECV = FSM_Steady(2),
        SEND = FSM_Transient(1),
        RECV = FSM_Transient(2),
    };

private:
    cMessage *ticEvent; // pointer to the event object which we'll use for timing

    cMessage *ticMsg; // variable to remember the message until we send it back

public:
    Tic();
    virtual ~Tic();

protected:
    virtual void initialize();
    virtual void handleMessage(cMessage *msg);
};

Define_Module(Tic);

Tic::Tic() {
    // Set the pointer to NULL, so that the destructor won't crash
    // even if initialize() doesn't get called because of a runtime
    // error or user cancellation during the startup process.
    ticEvent = ticMsg = NULL;
}

Tic::~Tic() {
    // Dispose of dynamically allocated the objects
    cancelAndDelete(ticEvent);

    delete ticMsg;

}

void Tic::initialize() {

    tic_fsm.setName("tic_fsm");

    // Create the event object we'll use for timing -- just any ordinary message.
    ticEvent = new cMessage("ticEvent");

    // No tictoc message yet.
    ticMsg = NULL;

    if (strcmp("tic", getName()) == 0) {
        // We don't start right away, but instead send an message to ourselves
        // (a "self-message") -- we'll do the first sending when it arrives
        // back to us, at t=5.0s simulated time.
        EV << "Scheduling first send to t=5.0s\n";
        ticMsg = new cMessage("ticMsg");
        scheduleAt(5.0, ticEvent);
    }
}

void Tic::handleMessage(cMessage *msg) {


    FSM_Switch(tic_fsm)
    {

    case FSM_Exit(g):
        FSM_Goto(tic_fsm, WAIT_SEND);
        break;

    case FSM_Enter(WAIT_SEND):
        scheduleAt(simTime() + 1.0, ticEvent);
        EV << "Scheduling send to toc in t=1s " << endl;
        break;

    case FSM_Exit(WAIT_SEND):
        FSM_Goto(tic_fsm, SEND);
        break;

    case FSM_Enter(WAIT_RECV):
        EV << "Warten auf Toc Msg! " << endl;
        break;

    case FSM_Exit(WAIT_RECV):

        FSM_Goto(tic_fsm, RECV);
        break;

    case FSM_Exit(SEND): {
        send(ticMsg, "out");
        ticMsg = NULL;
        FSM_Goto(tic_fsm, WAIT_RECV);
        break;
    }

    case FSM_Exit(RECV): {
        ticMsg = msg;
        FSM_Goto(tic_fsm, WAIT_SEND);
        break;
    }
    }        //}
}
