//Program to find out the maximum of two numbers using class template

#include<iostream>
using namespace std;
template<class T>

class pxycho
{
    T a;T b;
    public:
    pxycho(T x,T y)
    {
        a=x;
        b=y;
    }

    void max()
    {
        if(a>b)
        {
            cout<<a<<" is greater than "<<b<<endl;
        }
        else
        {
            cout<<b<<" is greater than "<<a<<endl;
        }
    }
};
int main()
{
    pxycho<int>obj(10,20);
    obj.max();

    pxycho<float>obj1(10.10,20.17);
    obj1.max();
    
    return 0;
}