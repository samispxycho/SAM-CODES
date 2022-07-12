//Calculate the area of shapes using virtual function

#include<iostream>
using namespace std;

class A
{
    int x;
    public:
    virtual void input()
    {
        cout<<"For area of square"<<endl;
        cout<<"Enter the length of side"<<endl;
        cin>>x;
    }
    virtual void area()
    {
        cout<<"Area of square is: "<<x*x<<endl;
    }
};

class B:public A
{
    int x,y;
    public:
    void input()
    {
        cout<<"For area of rectangle"<<endl;
        cout<<"Enter the value of length"<<endl;
        cin>>x;
        cout<<"Enter the value of breadth"<<endl;
        cin>>y;
    }
    void area()
    {
        cout<<"Area of rectangle is: "<<x*y<<endl;
    }
};

class C:public A
{
    int x;
    public:
    void input()
    {
        cout<<"For area of circle"<<endl;
        cout<<"Enter the value of radius"<<endl;
        cin>>x;
    }
    void area()
    {
        cout<<"Area of circle is: "<<3.14*(x*x)<<endl;
    }
};

int main()
{
    A *ptr;
    A obj;
    ptr=&obj;
    obj.input();
    obj.area();

    B obj1;
    ptr=&obj1;
    obj1.input();
    obj1.area();

    C obj2;
    ptr=&obj2;
    obj2.input();
    obj2.area();  

    return 0;
}