#include<iostream>
using namespace std;

class A
{
    int a;
    public:
    void input()
    {
        cout<<"Enter a number"<<endl;
        cin>>a;
    }

    void output()
    {
        cout<<"A="<<a<<endl;
    }
};

class B:virtual public A
{

};

class C:virtual public A
{

};

class D:public B, public C
{

};

int main()
{
    A ob; B ob1; C ob2; D ob3;

    ob.input();         //accessing base class using base class
    ob.output();        //object.

    ob1.input();        //accessing base class using derived1(B)
    ob1.output();       //class object.

    ob2.input();        //accessing base class using derived2(C)
    ob2.output();       //class object.

    ob3.input();        //accessing base class using derived3(D)
    ob3.output();       //class object publically linked to B and C

    return 0;
}