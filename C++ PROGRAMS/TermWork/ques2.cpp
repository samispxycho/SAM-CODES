//Program to acess static variable using scope resolution operator

#include<iostream>
using namespace std;

class pxycho
{
    public:
    static int num;
};

int pxycho::num=190;
int main()
{
    cout<<"The value of static variable num is "<<pxycho::num<<endl;
    return 0;
}