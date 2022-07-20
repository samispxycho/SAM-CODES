//Program to add three numbers using the concept of function overloading

#include<iostream>
using namespace std;

class base
{
    public:
    void add(int a,int b,int c)
    {
        cout<<"Sum is "<<a+b+c<<endl;
    }
};

class derived:public base
{
    public:
    void add(int a,int b,int c)
    {
        cout<<"Sum is "<<a+b+c<<endl;
    }
};
int main()
{
    base obj;
    derived obj1;

    obj.add(10,20,30);
    obj1.add(50,60,70);
    
    return 0;
}