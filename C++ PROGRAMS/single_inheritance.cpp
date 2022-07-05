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
        cout<<"a="<<a<<" and b="<<b<<endl;
    }
};

class derived: public base
{
    int m,n;
    public:
    void getdata()
    {
        cout<<"Enter two values"<<endl;
        cin>>m>>n;
    }

    void printdata()
    {
        cout<<"m= "<<m<<" and n="<<n<<endl;
    }
};

int main()
{
    base obj;
    derived obj1;

    //obj.input();          instead of using base class object,we can access its member
    //obj.output();         functions using derived class object.

    obj1.input();
    obj1.output();

    obj1.getdata();
    obj1.printdata();

    return 0;
}