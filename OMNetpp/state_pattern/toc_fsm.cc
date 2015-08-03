
#include <stdio.h>
#include <string.h>
#include <omnetpp.h>


class cBaseState: public cObject {
    class Toc* p;

public:
    virtual void handle();
    cBaseState(Toc* machine);

};



class Toc: public cSimpleModule {

protected:
    void initialize();
    void handleMessage(cMessage* msg);
public:
   void setNewState (cBaseState* previousState);
};



/*----------------------STATES OF TOC---------------------*/
class Toc_RECV: public cBaseState {
    void handle();
};
class Toc_SEND: public cBaseState {
    void handle();
};
class Toc_WAITTORECV: public cBaseState {
    void handle();
};
class Toc_WAITTOSEND: public cBaseState {
    void handle();
};

