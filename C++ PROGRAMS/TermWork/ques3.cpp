//sum and cube using inline function.

#include<iostream>
using namespace std;

class A
{
    public:
    inline int sum(int num1,int num2)
    {
        cout<<"Sum is "<<num1+num2<<endl;
    }
    inline int cube(int num1)
    {
        cout<<"Cube is "<<num1*num1*num1<<endl;
    }
};

int main()
{
    int num1,num2;
    cout<<"Enter your first number"<<endl;
    cin>>num1;
    cout<<"Enter your second number"<<endl;
    cin>>num2;

    A obj;
    obj.sum(num1,num2);
    obj.cube(num1);
    return 0;
}