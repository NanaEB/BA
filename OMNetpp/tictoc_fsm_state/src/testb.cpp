
#include <iostream>
using namespace std;
class Machine
{
  class State *current;
  public:
    Machine();
    void setCurrent(State *s)
    {
        current = s;
    }
    void on();
    void off();
};

class State
{
  public:
    virtual void on(Machine *m)
    {
        cout << "   already ON\n";
    }
    virtual void off(Machine *m)
    {
        cout << "   already OFF\n";
    }
};

void Machine::on()
{
  current->on(this);
}

void Machine::off()
{
  current->off(this);
}

class ON: public State
{
  public:
    ON()
    {
        cout << "   ON-ctor ";
    };
    ~ON()
    {
        cout << "   dtor-ON\n";
    };
    void off(Machine *m);
};

class OFF: public State
{
  public:
    OFF()
    {
        cout << "   OFF-ctor ";
    };
    ~OFF()
    {
        cout << "   dtor-OFF\n";
    };
    void on(Machine *m)
    {
        cout << "   going from OFF to ON";
        m->setCurrent(new ON());
        delete this;
    }
};

void ON::off(Machine *m)
{
  cout << "   going from ON to OFF";
  m->setCurrent(new OFF());
  delete this;
}

Machine::Machine()
{
  current = new OFF();
  cout << '\n';
}

int main()
{
  void (Machine::*offptr)() = &Machine::off;    //offptr is a member funct pointer that now points to Machine::off function
  void (Machine::*onptr)() = &Machine::on;      //onptr is a member funct pointer that now points to Machine::on function
  Machine fsm;
  int num;
  while (1)
  {
      cout<<"Enter 0/1: ";
      cin>>num;
      if( num == 0 )
      {
          (fsm.*offptr)();          //Here your are calling the function pointed to by the offptr (i.e., Machine::off) using the pointer
      }
      else if( num == 1 )
      {
          (fsm.*onptr)();           //Here your are calling the function pointed to by the onptr (i.e., Machine::on) using the pointer
      }
  }

}
