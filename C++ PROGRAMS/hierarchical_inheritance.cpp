#include<iostream>
using namespace std;

class base
{
    int a,b;
    public:
    void input()
    {
        cout<<"Enter two values"<<endl;
        cin>>a>>b;
    }
    void output()
    {
        cout<<"a+b="<<a+b<<endl;
    }
};

class derived1:public base
{
    int n1;
    public:
    void input1()
    {
        cout<<"Enter a number"<<endl;
        cin>>n1;
    }

    void output1()
    {
        cout<<"Number="<<n1;
    }
};

class derived2:public base
{
    int n1;
    public:
    void input2()
    {
        cout<<"Enter a number"<<endl;
        cin>>n1;
    }

    void output2()
    {
        cout<<"Number="<<n1<<endl;
    }
};

int main()
{
    derived1 obj1;
    obj1.input();
    obj1.output();
    obj1.input1();
    obj1.output1();
                        //derived classes are used to access base
    derived2 obj2;      //class member functions.
    obj2.input();
    obj2.output();
    obj2.input2();
    obj2.output2();
    
    return 0;
}