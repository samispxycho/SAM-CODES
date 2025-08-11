//Program to implement the use of single inheritance
//Single inheritance: one base class and one derived class

#include<iostream>
using namespace std;

class base
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

    void display()
    {
        cout<<"First value you entered is "<<a<<endl;
        cout<<"Second value you entered is "<<b<<endl;
    }
};

class derived:public base
{
    int m,n;
    public:
    void get_details()
    {
        cout<<"Enter your first value"<<endl;
        cin>>m;
        cout<<"Enter your second value"<<endl;
        cin>>n;
    }
    void print_details()
    {
        cout<<"First value "<<m<<endl;
        cout<<"Second value "<<n<<endl;
    }
};
int main()
{
    //We can now access base class functions using derived class object

    derived obj;
    obj.input();
    obj.display();
    obj.get_details();
    obj.print_details();
    return 0;
}