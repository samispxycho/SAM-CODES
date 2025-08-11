//Program to implement unary operator overloading using friend function

#include<iostream>
using namespace std;

class pxycho
{
    int a,b;
    public:
    pxycho(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        cout<<"Value of a is "<<a<<endl;
        cout<<"Value of b is "<<b<<endl;
    }

    friend void operator -(pxycho &obj);
};

void operator-(pxycho &obj)
{
    obj.a=-obj.a;
    obj.b=-obj.b;
}
int main()
{
    pxycho ob(10,-20);
    ob.display();
    -ob;
    ob.display();
    return 0;
}