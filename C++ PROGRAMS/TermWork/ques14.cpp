//Program to add two complex numbers using binary operator overloading

#include<iostream>
using namespace std;

class complex
{
    int real,imag;
    public:
    complex()
    {

    }
    complex(int r,int i)
    {
        real=r;
        imag=i;
    }

    complex operator +(complex c2)
    {
        complex c3;
        c3.real=real+c2.real;
        c3.imag=imag+c2.imag;

        return c3;
    }

    void display()
    {
        cout<<real<<"+i"<<imag<<endl;
    }
};
int main()
{
    complex c1(10,20);
    complex c2(30,40);
    complex c3;
    c3=c1+c2;
    c3.display();
    return 0;
}