//Program to implement the use of hybrid inheritance
//Hybrid inheritance: combination of two or more inheritances

#include<iostream>
using namespace std;

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
        cout<<"The number you entered is "<<a<<endl;
    }
};

class derived1:virtual public base
{

};

class derived2:virtual public base
{

};

class derived3:public derived1,public derived2
{

};

int main()
{
    derived3 obj3;
    obj3.input();
    obj3.output();

    return 0;
}