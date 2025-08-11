//Use of friend function

#include<iostream>
using namespace std;

class pxycho
{
    int a,b;
    public:
    void input()
    {
        cout<<"Enter first value"<<endl;
        cin>>a;
        cout<<"Enter second value"<<endl;
        cin>>b;
    }
    friend void sum(pxycho obj);
};
void sum(pxycho obj)
{
    int c;
    c=obj.a+obj.b;
    cout<<"Sum of the two entered numbers is "<<c;
}
int main()
{
    pxycho ob;
    ob.input();
    sum(ob);
    return 0;
}