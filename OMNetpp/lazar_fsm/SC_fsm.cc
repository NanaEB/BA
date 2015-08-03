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

class SC: public cSimpleModule {

    // FSM and its states
    cFSM sc_fsm;
    enum {
        INIT = 0,
        PSEUDOSYNC = FSM_Steady(1),
        INTEGRATE = FSM_Steady(2),
        SYNC = FSM_Steady(3),
        STABLE = FSM_Steady(4),
    };

private:
    cMessage *handleMsgEvent;
    bool clique_Detection;
    int stable_cycle_counter;

public:
    SC();
    virtual ~SC();

protected:
    virtual void initialize();
    virtual void handleMessage(cMessage *msg);
};

Define_Module(SC);

SC::SC() {
    // Set the pointer to NULL, so that the destructor won't crash
    // even if initialize() doesn't get called because of a runtime
    // error or user cancellation during the startup process.
    handleMsgEvent = NULL;
}

SC::~SC() {
    // Dispose of dynamically allocated the objects
    cancelAndDelete(handleMsgEvent);

}

void SC::initialize() {
    WATCH(stable_cycle_counter);
    sc_fsm.setName("sc_fsm");
    stable_cycle_counter = 0;
    // Create the event object we'll use for timing
    handleMsgEvent = new cMessage("handleMsgEvent");

    EV << "Scheduling first send to t=5.0s\n";

    scheduleAt(5.0, handleMsgEvent);

}

void SC::handleMessage(cMessage *msg) {

    if (uniform(0, 1) < 0.5) {
        clique_Detection = false;
    } else {
        clique_Detection = true;
    }

    FSM_Switch(sc_fsm)
    {

    case FSM_Exit(INIT):

        if (par("read").boolValue() == true) {
            EV << "read == TRUE " << endl;
            FSM_Goto(sc_fsm, PSEUDOSYNC);
        } else {
            EV << "read == FALSE " << endl;
            FSM_Goto(sc_fsm, INTEGRATE);
        }
        break;

    case FSM_Enter(PSEUDOSYNC):

        break;

    case FSM_Enter(INTEGRATE):
        scheduleAt(simTime() + 5.0, handleMsgEvent);
        break;

    case FSM_Exit(INTEGRATE):

        if (clique_Detection == true) {
            EV << "clique_Detection == TRUE" << endl;
            FSM_Goto(sc_fsm, INTEGRATE);
        } else {
            EV << "clique_Detection == FALSE " << endl;
            FSM_Goto(sc_fsm, SYNC);
        }
        break;

    case FSM_Enter(SYNC):

        scheduleAt(simTime() + 5.0, handleMsgEvent);
        break;

    case FSM_Exit(SYNC):
        if (clique_Detection == true) {
            EV << "clique_Detection == TRUE" << endl;
            FSM_Goto(sc_fsm, INTEGRATE);
            stable_cycle_counter = 0;
        } else if ((clique_Detection == false)
                && (stable_cycle_counter >= par("num_stable_cycles").longValue())) {
            EV << "clique_Detection == FALSE && StablCounter erreicht! "
                      << endl;
            stable_cycle_counter = 0;
            FSM_Goto(sc_fsm, STABLE);
        } else {
            EV << "clique_Detection == FALS" << endl;
            stable_cycle_counter++;
            FSM_Goto(sc_fsm, SYNC);
        }
        break;

    case FSM_Enter(STABLE):
        scheduleAt(simTime() + 5.0, handleMsgEvent);
        break;

    case FSM_Exit(STABLE):

        if (clique_Detection == true) {
            EV << "clique_Detection == TRUE" << endl;
            FSM_Goto(sc_fsm, INTEGRATE);
        } else {
            EV << "clique_Detection == FALSE " << endl;
            FSM_Goto(sc_fsm, STABLE);
        }
        break;

    }
}
