#include<iostream>
using namespace std;

class base
{
    public:
    virtual void show()
    {
        cout<<"Base class"<<endl;
    }
};

class derived: public base
{
    public:
    void show()
    {
        cout<<"Derived class"<<endl;
    }
};
int main()
{
    base *ptr;
    base ob;
    ptr=&ob;
    ptr->show();

    cout<<endl;

    derived obj;
    ptr=&obj;
    ptr->show(); 

    return 0;