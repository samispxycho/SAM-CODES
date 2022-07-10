//Use of virtual function

#include<iostream>
using namespace std;

class base
{
    public:
    void display()      //just to show that it wont work without virtual keyword
    {
        cout<<"Base class display"<<endl;
    }

    virtual void show()
    {
        cout<<"Base class show"<<endl;
    }
};

class derived:public base
{
    public:
    void display()
    {
        cout<<"Derived class display"<<endl;
    }

    void show()
    {
        cout<<"Derived class show"<<endl;
    }
};

int main()
{
    base * p;
    base obj;
    derived obj1;

    p=&obj;
    p->display();       
    p->show();

    p=&obj1;
    p->display();
    p->show();

    return 0;
}