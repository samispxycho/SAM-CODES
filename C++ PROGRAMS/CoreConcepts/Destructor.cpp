#include<iostream>
using namespace std;

class pxycho
{
    public:
    pxycho()
    {
        int num=30;
        cout<<"Number entered is "<<num<<endl;
    }

    ~pxycho()
    {
        cout<<"Object destroyed"<<endl;
    }
};
int main()
{
    pxycho obj;
    return 0;
}