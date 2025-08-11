//Program to implement the use of multiple inheritance
//multiple inheritance: multiple base classes and one derived class

#include<iostream>
using namespace std;

class base1
{
    int a,b,c;
    public:
    void input()
    {
        cout<<"Enter your first number"<<endl;
        cin>>a;
        cout<<"Enter your second number"<<endl;
        cin>>b;
    }

    void display()
    {
        c=a+b;
        cout<<"Sum of the two numbers entered is "<<c<<endl;
    }
};

class base2
{
    int m,n,o;
    public:
    void get_details()
    {
        cout<<"Enter your first number"<<endl;
        cin>>m;
        cout<<"Enter your second number"<<endl;
        cin>>n;
    }

    void print_details()
    {
        o=m-n;
        cout<<"Subtraction of the two numbers entered is "<<o<<endl;
    }
};

class derived:public base1,public base2
{
    int i,j,k;
    public:
    void enter()
    {
        cout<<"Enter your first value"<<endl;
        cin>>i;
        cout<<"Enter your second value"<<endl;
        cin>>j;
    }

    void output()
    {
        k=i*j;
        cout<<"Product of the two numbers entered is "<<k<<endl;
    }
};
int main()
{
    //We can acess all functions using only derived class object

    derived obj;
    obj.input();
    obj.display();

    obj.get_details();
    obj.print_details();

    obj.enter();
    obj.output();
    return 0;
}