//Program to implement the use of multilevel inheritance
/*
multilevel inheritance: a derived class is inherited to another derived class
which is inherited to a base class
*/

#include<iostream>
using namespace std;

class base
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
        cout<<"The number you entered is "<<a<<endl;
    }
};

class derived1:public base
{
    int b;
    public:
    void input1()
    {
        cout<<"Enter a number"<<endl;
        cin>>b;
    }
    void output1()
    {
        cout<<"The number you entered is "<<b<<endl;
    }
};

class derived2:public derived1
{
    int c;
    public:
    void input2()
    {
        cout<<"Enter a number"<<endl;
        cin>>c;
    }

    void output2()
    {
        cout<<"The number you entered is "<<c<<endl;
    }
};
int main()
{
    //Using derived1 class objects we can acess base and itself
    derived1 obj1;
    obj1.input();
    obj1.output();
    obj1.input1();
    obj1.output1();

    //Using derived2 class objects we can acess base,derived1 and itself
    derived2 obj2;
    obj2.input();
    obj2.output();
    obj2.input1();
    obj2.output1();
    obj2.input2();
    obj2.output2();
    return 0;
}