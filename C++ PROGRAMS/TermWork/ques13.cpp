//Program to increment and decrement using operator overloading

#include<iostream>
using namespace std;

class pxycho
{
    int a,b;
    public:
    void input()
    {
        cout<<"Enter your first value"<<endl;
        cin>>a;
        cout<<"Enter your second value"<<endl;
        cin>>b;
    }

    void operator ++()
    {
        a++;
        b++;
    }

    void operator --()
    {
        a--;
        b--;
    }

    void display()
    {
        cout<<"Value of A is "<<a<<endl;
        cout<<"Value of B is "<<b<<endl;
    }
};
int main()
{
    pxycho obj;
    obj.input();
    cout<<"Original values"<<endl;
    obj.display();

    ++obj;
    cout<<"After incrementing"<<endl;
    obj.display();   

    --obj;
    --obj;
    cout<<"After decrementing"<<endl;
    obj.display();

    return 0;
}