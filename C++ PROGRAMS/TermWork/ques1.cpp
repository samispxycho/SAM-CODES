//Program to print student details using class and objects

#include<iostream>
using namespace std;

class student
{
    int roll;
    int phone;
    char name[20];

    public:
    void get_details()
    {
        cout<<"Enter your roll number"<<endl;
        cin>>roll;
        cout<<"Enter your name"<<endl;
        cin>>name;
        cout<<"Enter your phone number"<<endl;
        cin>>phone;
    }

    void print_details()
    {
        cout<<"    Student details      "<<endl<<endl;
        cout<<"Student's roll number is "<<roll<<endl;
        cout<<"Student's name is "<<name<<endl;
        cout<<"Student's phone number is "<<phone<<endl;
    }
};
int main()
{
    student obj;
    obj.get_details();
    obj.print_details();  
    return 0;
}