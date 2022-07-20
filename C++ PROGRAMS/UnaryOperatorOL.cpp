//Program to implement unary operator overloading using class function
//Unary operator overloading using friend function in UnaryOperatorOL2.cpp


#include<iostream>
using namespace std;

class pxycho
{
    int a,b;
    public:
    pxycho (int x, int y)
    {
        a=x;
        b=y;
    }

    void display()
    {
        cout<<"Value of a is "<<a<<endl;
        cout<<"Value of b is "<<b<<endl;
    }

    void operator -()
    {
        a=-a;
        b=-b;
    }
};
int main()
{
    pxycho obj(10,-20);
    obj.display();
    -obj;
    obj.display();
    return 0;
}