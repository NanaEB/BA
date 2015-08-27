<?xml version="1.0" encoding="UTF-8"?>
#define FSM_DEBUG      
#include <stdio.h>
#include <string.h>
#include <omnetpp.h>
		
		
class FSM: public cSimpleModule{
	cFSM fsm;
	enum {	
			init = 0,
			A = FSM_Steady(1),
			C = FSM_Steady(2),
			D = FSM_Steady(3),
			B = FSM_Transient(1),
			E = FSM_Transient(2),
			
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
		
		case FSM_Exit(init):
			 if(init_inA){
			 	init_outA;
		 	 	FSM_Goto(fsm, A);
		 	 }
			 break;
		
			
		case FSM_Enter(A):
			 break;
			 
		
		case FSM_Exit(A):
			 if(AinB){
		  		AoutB;
				FSM_Goto(fsm, B);
			 }
			 if(AinC){
		  		AoutC;
				FSM_Goto(fsm, C);
			 }
			 break;
			 
			
		case FSM_Enter(B):
			 break;
			 
		
		case FSM_Exit(B):
			 if(BinC){
		  		BoutC;
				FSM_Goto(fsm, C);
			 }
			 break;
			 
			
		case FSM_Enter(C):
			 break;
			 
		
		case FSM_Exit(C):
			 if(CinD){
		  		CoutD;
				FSM_Goto(fsm, D);
			 }
			 break;
			 
			
		case FSM_Enter(D):
			 break;
			 
		
		case FSM_Exit(D):
			 if(DinE){
		  		DoutE;
				FSM_Goto(fsm, E);
			 }
			 if(DinA){
		  		DoutA;
				FSM_Goto(fsm, A);
			 }
			 if(Din_init){
		  		Dout_init;
				FSM_Goto(fsm, init);
			 }
			 break;
			 
			
		case FSM_Enter(E):
			 break;
			 
		
		case FSM_Exit(E):
			 if(Eout_init){
		  		Eout_init;
				FSM_Goto(fsm, init);
			 }
			 break;
			 
			

	}
}		
		
	