#include<iostream>
using namespace std;

class base
{
    int a,b;
    public:
    void input()
    {
        cout<<"Enter two values"<<endl;
        cin>>a>>b;
    }
    friend class derived;
};

class derived
{
    int s;
    public:
    void add(base ob)
    {
        s=ob.a+ob.b;
        cout<<"Sum="<<s<<endl;
    }
};
int main()
{
    base obj1;
    derived obj2;

    obj1.input();
    obj2.add(obj1);
    return 0;
}