#include<iostream>
using namespace std;

class pxycho
{
    int a,b;
    public:
    void in()
    {
        cout<<"Enter first value"<<endl;
        cin>>a;
        cout<<"Enter second value"<<endl;
        cin>>b;
    }
    friend void out(pxycho obj);
};
void out(pxycho obj)
{
    int sum;
    sum=obj.a+obj.b;
    cout<<"Sum of the numbers is "<<sum<<endl;
}

int main()
{
    pxycho ob;
    ob.in();
    out(ob);
    return 0;
}