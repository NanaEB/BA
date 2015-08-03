/*
 * toc_code.cc
 *
 *  Created on: 26.05.2015
 *      Author: Nana
 */

#define FSM_DEBUG

#include <stdio.h>
#include <string.h>
#include <omnetpp.h>

class Toc: public cSimpleModule {

    // FSM and its states
    cFSM toc_fsm;
    enum {
        INIT = 0,
        WAIT_SEND = FSM_Steady(1),
        WAIT_RECV = FSM_Steady(2),
        SEND = FSM_Transient(1),
        RECV = FSM_Transient(2),
    };

private:

    cMessage *tocEvent; // pointer to the event object which we'll use for timing

    cMessage *tocMsg; // variable to remember the message until we send it back

public:
    Toc();
    virtual ~Toc();

protected:
    virtual void initialize();
    virtual void handleMessage(cMessage *msg);
};

Define_Module(Toc);

Toc::Toc() {
    // Set the pointer to NULL, so that the destructor won't crash
    // even if initialize() doesn't get called because of a runtime
    // error or user cancellation during the startup process.
    tocEvent = tocMsg = NULL;
}

Toc::~Toc() {
    // Dispose of dynamically allocated the objects

    cancelAndDelete(tocEvent);

    delete tocMsg;
}

void Toc::initialize() {
    toc_fsm.setName("toc_fsm");
    // Create the event object we'll use for timing -- just any ordinary message.
    tocEvent = new cMessage("tocEvent");
    // No tictoc message yet.
    tocMsg = NULL;
    EV << "Enter the FSM in t=4.0s" << endl;

    scheduleAt(5.0, tocEvent);
}

void Toc::handleMessage(cMessage *msg) {

    FSM_Switch(toc_fsm)
    {

    case FSM_Exit(INIT):
        FSM_Goto(toc_fsm, WAIT_RECV);
        break;

    case FSM_Enter(WAIT_SEND):
        scheduleAt(simTime() + 1.0, tocEvent);
        EV << "Scheduling send to tic in t=1s\n " << endl;
        break;

    case FSM_Exit(WAIT_SEND):
        FSM_Goto(toc_fsm, SEND);
        break;

    case FSM_Enter(WAIT_RECV):
        EV << "Warten auf Tic Msg! " << endl;
        break;

    case FSM_Exit(WAIT_RECV):

        FSM_Goto(toc_fsm, RECV);
        break;

    case FSM_Exit(SEND): {
        send(tocMsg, "out");
        tocMsg = NULL;
        FSM_Goto(toc_fsm, WAIT_RECV);
        break;
    }

    case FSM_Exit(RECV): {
        tocMsg = msg;
        FSM_Goto(toc_fsm, WAIT_SEND);
        break;
    }
    }    //}

}
