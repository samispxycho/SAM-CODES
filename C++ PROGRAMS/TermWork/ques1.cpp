//Student details using the concept of class and objects

#include<iostream>
using namespace std;

class A
{
    int roll;
    char name[50];
    int phone;
    public:
    
    void get_details()
    {
        cout<<"Enter student's roll number"<<endl;
        cin>>roll;
        cout<<"Enter student's name"<<endl;
        cin>>name;
        cout<<"Enter student's phone"<<endl;
        cin>>phone;
    }

    void print_details()
    {
        cout<<"Student's roll number is "<<roll<<endl;
        cout<<"Student's name is "<<name<<endl;
        cout<<"Student's phone number is "<<phone<<endl;
    }
};

int main()
{
    A obj;
    obj.get_details();
    obj.print_details();

    return 0;
}