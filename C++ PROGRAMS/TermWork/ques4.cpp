//access global variable using scope resolution operator

#include<iostream>
using namespace std;

int num=100;

class A
{
    int num;
    public:
    void local()
    {
        cout<<"Enter a number for local variable"<<endl;
        cin>>num;
        cout<<"Value of local variable is "<<num<<endl;
    }
};

int main()
{
    A obj;
    obj.local();
    cout<<"Value of global variable is "<<::num;
    return 0;
}