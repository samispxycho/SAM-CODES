#include<iostream>
using namespace std;

class base1
{
    int a,b,c;
    public:
    void input1()
    {
        cout<<"Enter two values"<<endl;
        cin>>a>>b;
    }

    void print1()
    {
        c=a+b;
        cout<<"Sum="<<c<<endl;
    }
};

class base2
{
    int a,b,c;
    public:
    void input2()
    {
        cout<<"Enter two values"<<endl;
        cin>>a>>b;
    }

    void print2()
    {
        c=a-b;
        cout<<"Sub="<<c<<endl;
    }
};

class derived:public base1,public base2
{
    int a,b,c;
    public:
    void input3()
    {
        cout<<"Enter two values"<<endl;
        cin>>a>>b;
    }

    void print3()
    {
        c=a*b;
        cout<<"Multiply="<<c<<endl;
    }
};

int main()
{
    //base1 obj1;
    //obj1.input1();
    //obj1.print1();

    //base2 obj2;           instead of using sepearate objects,
    //obj2.input2();        we can use object of derived class 
    //obj2.print2();        only.


    derived obj3;
    
    obj3.input1();
    obj3.print1();

    obj3.input2();
    obj3.print2();

    obj3.input3();
    obj3.print3();
    
    return 0;
}