//Program to access the value of global variable using scope resolution

#include<iostream>
using namespace std;

int num=190;

class pxycho
{
    int num=200;
    public:
    void display()
    {
        cout<<"The value of local variable num is "<<num<<endl;
        cout<<"The value of global variable num is "<<::num<<endl;
    }
};
int main()
{
    pxycho obj;
    obj.display();
    return 0;
}