#include<iostream>
using namespace std;

class pxycho
{
    int num1=250,num2=150;
    public:
    void func()
    {
        int sum=num1+num2;
        cout<<"Sum of the two numbers is "<<sum<<endl;
    }

    void func(int a,int b)
    {
        int sub=a-b;
        cout<<"Subtraction of the numbers is "<<sub<<endl;
    }
};
int main()
{
    pxycho obj;
    obj.func();
    obj.func(250,150);
    return 0;
}