//Program to print the sum and multiplication using inline function

#include<iostream>
using namespace std;

class pxycho
{
    public:
    inline int sum(int x,int y)
    {
        return(x+y);
    }

    inline int multi(int x,int y)
    {
        return x*y;
    }
};
int main()
{
    int num1,num2,s,m;
    cout<<"Enter your first number"<<endl;
    cin>>num1;
    cout<<"Enter your second number"<<endl;
    cin>>num2;

    pxycho obj;
    s=obj.sum(num1,num2);
    m=obj.multi(num1,num2);

    cout<<"The sum of the two numbers entered is "<<s<<endl;
    cout<<"The multiplication of the two numbers entered is "<<m<<endl;
    return 0;
}