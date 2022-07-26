#include<iostream>
using namespace std;

class base
{
    public:
    virtual void show()
    {
        cout<<"Base class show function"<<endl;
    }

    virtual void print()
    {
        cout<<"Base class print function"<<endl;
    }
};

class derived:public base
{
    public:
    void show()
    {
        cout<<"Derived class show function called"<<endl;
    }
    void print()
    {
        cout<<"Derived class print function called"<<endl;
    }
};
int main()
{
    base *ptr;
    base ob;
    derived obj;

    ptr=&obj;
    ptr->show();
    ptr->print();

    ptr=&ob;
    ptr->show();
    ptr->print();

    return 0;
}