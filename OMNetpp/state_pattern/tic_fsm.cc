
#include <stdio.h>
#include <string.h>
#include <omnetpp.h>


class cBaseState: public cObject {
    class Tic* p;

public:
    virtual void handle();
    cBaseState(Tic* machine);

};





class Tic: public cSimpleModule {

protected:
    void initialize();
    void handleMessage(cMessage* msg){


    }
public:
   void setNewState (cBaseState* previousState);
};





/*----------------------STATES OF TIC---------------------*/
class Tic_RECV: public cBaseState {
    void handle();
};
class Tic_SEND: public cBaseState {
    void handle();
};
class Tic_WAITTORECV: public cBaseState {
    void handle();
};
class Tic_WAITTOSEND: public cBaseState {
    void handle();
};
