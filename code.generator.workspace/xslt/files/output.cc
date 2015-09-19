<?xml version="1.0" encoding="UTF-8"?>
#define FSM_DEBUG      
#include <stdio.h>
#include <string.h>
#include <omnetpp.h>
		
		
class FSM: public cSimpleModule{
	cFSM fsm;
	enum {	
			INIT = 0,
			tic = FSM_Steady(1),
			toe = FSM_Steady(2),
			toc = FSM_Transient(1),
			
 		 };

public:
    FSM();
    virtual ~FSM();

protected:
    virtual void initialize();
    virtual void handleMessage(cMessage *msg);
};

Define_Module(FSM);

FSM::FSM() {}

FSM::~FSM() {}

void Tic::initialize() {

    fsm.setName("fsm");

}


void FSM::handleMessage(cMessage *msg) {

	FSM_Switch(fsm){
		
		case FSM_Exit(INIT):
			 if(start ==true){
				 //actions
				hallo();
				
		 	 	 FSM_Goto(fsm, tic);
			 }
			 break;
	
    
    
    
  
    
    
    
  
    
  

	}
}		
		
	