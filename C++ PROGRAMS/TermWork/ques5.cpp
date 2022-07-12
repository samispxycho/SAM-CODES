//calculate the net salary

#include<iostream>
using namespace std;

class employee
{
    char name[50];
    int empID;
    float basic,da,it,gross,net;
    
    public:
    void input()
    {
        cout<<"Enter the employee's name "<<endl;
        cin>>name;
        cout<<"Enter the employee's ID "<<endl;
        cin>>empID;
        cout<<"Enter the employee's basic salary "<<endl;
        cin>>basic;
    }

    int calculate()
    {
        da=basic*0.52;
        gross=basic+da;
        it=gross*0.30;
        net=(basic+da)-it;
        return net;
    }

    void output()
    {
        cout<<"Name of the employee: "<<name<<endl;
        cout<<"Employee ID number: "<<empID<<endl;
        cout<<"Net salary of the employee is: "<<net<<endl;
    }
};
int main()
{
    employee obj;
    obj.input();
    obj.calculate();
    obj.output();

    return 0;
}