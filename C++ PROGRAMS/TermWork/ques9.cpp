/*
Program to add three numbers using the concept of function overriding.
Function overriding condition is achieved when a derived class inheriting a base
class have a function of same name and parameters.(not without inheritance)
It is an example of run time polymorphism.
*/

#include<iostream>
using namespace std;

class base
{
    public:
    void sum(int x,int y,int z)
    {
        cout<<"Sum of the numbers of base class is: "<<x+y+z<<endl;
    }
};

class derived: public base
{
    public:
    void sum(int x,int y,int z)
    {
        cout<<"Sum of the numbers of derived class is: "<<x+y+z<<endl;
    }
};

int main()
{
    base obj1;
    derived obj2;

    obj1.sum(1,1,1);
    obj2.sum(2,2,2);
    return 0;
}