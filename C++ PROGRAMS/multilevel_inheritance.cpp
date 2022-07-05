#include<iostream>
using namespace std;
//SAM
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
        cout<<"A="<<a<<endl;
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
        cout<<"B="<<b<<endl;
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
        cout<<"C="<<c;
    }
};
int main()
{
    derived1 obj1;
    obj1.input();           //accessing base class MF using derived
    obj1.output();          //1 class object.
    obj1.input1();
    obj1.output1();

    derived2 obj2;
    obj2.input();
    obj2.output();         //accessing base and derived1 class MF
    obj2.input1();         //using derived2 class object.
    obj2.output1();
    obj2.input2();
    obj2.output2();

    return 0;
}