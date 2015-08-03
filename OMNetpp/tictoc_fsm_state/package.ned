package tictoc_fsm_state;

@license(LGPL);

simple Tic
{
    parameters:
        @display("i=block/routing");
    gates:
        input in;
        output out;
}

simple Toc
{
    parameters:
        @display("i=block/routing");
    gates:
        input in;
        output out;
}


network tictoc_fsm_net
{
    submodules:
        tic: Tic {
            parameters:
                @display("i=,cyan");
        }
        toc: Toc {
            parameters:
                @display("i=,gold");
        }
    connections:
        tic.out --> {  delay = 100ms; } --> toc.in;
        tic.in <-- {  delay = 100ms; } <-- toc.out;
}