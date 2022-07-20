//Program to implement the use of hierarchical inheritance
//Hierarchical inheritance: one base class and multiple derived classes

#include<iostream>
using namespace std;

class base
{
    int num;
    public:
    void input()
    {
        cout<<"Enter a number"<<endl;
        cin>>num;
    }

    void output()
    {
        cout<<"The number you entered is "<<num<<endl;
    }
};

class derived1:public base
{
    int num1;
    public:
    void input1()
    {
        cout<<"Enter a number"<<endl;
        cin>>num1;
    }

    void output1()
    {
        cout<<"The number you entered is "<<num1<<endl;
    }
};

class derived2:public base
{
    int num2;
    public:
    void input2()
    {
        cout<<"Enter a number"<<endl;
        cin>>num2;
    }

    void output2()
    {
        cout<<"The number you entered is "<<num2<<endl;
    }
};
int main()
{
    derived1 obj1;

    obj1.input();
    obj1.output();
    obj1.input1();
    obj1.output1();

    derived2 obj2;
    obj2.input();
    obj2.output();
    obj2.input2();
    obj2.output2();
    return 0;
}