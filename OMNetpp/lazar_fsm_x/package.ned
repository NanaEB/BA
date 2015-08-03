package lazar_fsm;

@license(LGPL);


//
// Interface of TTEthernet ports. A port is a virtual instance that can receive
// critical traffic through its gates.
//
// Modules implementing IPort are not necessarily physical ports.
//
// @see TTEPHYPort, Sync, ITTEApplication
//
// @author Till Steinbach
moduleinterface IPort
{
    gates:
        //Input for time-triggered traffic
        input TTin @directIn @labels(CTFrame);
        //Input for rate-constrained traffic
        input RCin @directIn @labels(CTFrame);
}


//
// Synchronisation module interface
//
// @see IPort
//
// @author Till Steinbach
moduleinterface ISync extends IPort
{
    parameters:
        @display("i=block/timer");
        
    gates:
        //Input for scheduler messages
        input schedulerIn @directIn;
}



simple SC like ISync
{
     parameters:
        //SCState is implemented by the SCState C++ Class
    @class(SC);
    @display("i=block/timer");

int syncDomain =default(2);
int syncPriority =default(4);	




//Each SC should have a unique ID
int id=default(0);
//__________________________________________________________________________________________________________________
bool read=default(false);

int precision =default(80);
int int_cycle_duration =default(12500);
int clock_corr_delay=2*precision+1;
//typically set to the number of faulty synchronization masters to be tolerated	
int MembershipAcceptanceRange =default(0);

int max_transmission_delay =default(187); 
int max_integration_cycles =default(10000);
int smc_scheduled_receive_pit =default(374);
//__________________________________________________________________________________________________________________
int num_stable_cycles =default(3);

int num_unstable_cycles =default(1);

int max_pcf_membership =default(3); 
//ok
int sm_restart_timeout_async =default(12500);

//ok
int sm_restart_timeout_sync =default(12500);
//ok
int sm_listen_timeout =default(12500);

//PoInT

int smc_sync_eval_pit=smc_scheduled_receive_pit+precision;
int smc_async_eval_pit =default(0);

int smc_clock_corr_pit=smc_scheduled_receive_pit+clock_corr_delay;



int sm_sync_threshold_async =default(3);
int sc_integrate_to_sync_thrld =default(3);
int sc_sync_threshold_sync =default(3);
int sc_stable_threshold_async =default(3);
int sc_stable_threshold_sync =default(3);
bool sc_sync_to_stable_enabled =default(true);


int acceptance_window=2*precision;

    
      gates:
      
        //Input for rate-constrained traffic
        input RCin @directIn @labels(CTFrame);
        //Input for time-triggered traffic, not used, required by interface `ttethernet.linklayer.IPort'
        input TTin @directIn @labels(CTFrame);
        //Input for scheduler messages
        input schedulerIn @directIn;
}




network fsm_net
{
    submodules:
        fsm: SC;
 
}