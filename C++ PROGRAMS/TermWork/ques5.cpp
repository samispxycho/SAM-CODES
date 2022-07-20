//Program to calculate net salary of employee using array of object

#include<iostream>
using namespace std;

class emp
{
    char name[20];
    int basic,ta,bonus;
    public:
    void input()
    {
        cout<<"Enter your name"<<endl;
        cin>>name;
        cout<<"Enter your basic salary"<<endl;
        cin>>basic;
        cout<<"Enter your travelling allowace"<<endl;
        cin>>ta;
        cout<<"Enter your bonus amount"<<endl;
        cin>>bonus;
    }

    int total()
    {
        int net=basic+ta+bonus;
        return net;
    }

    void display()
    {
        int sal=total();
        cout<<"Name: "<<name<<endl;
        cout<<"Your net salary is: "<<sal<<endl;
    }
};
int main()
{
    emp obj[3];
    for(int i=0;i<3;i++)
    {
        obj[i].input();
        obj[i].total();
    }
    for(int i=0;i<3;i++)
    {
        obj[i].display();
    }
    return 0;
}