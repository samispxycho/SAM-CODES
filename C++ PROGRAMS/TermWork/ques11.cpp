//Program to print the typing details of a typist

#include<iostream>
using namespace std;

class typist
{
    protected:
    char name[20];
    char add[20];
    int code,hindisp,englishsp;

    public:
    void input()
    {
        cout<<"Enter your name"<<endl;
        cin>>name;
        fflush(stdin);
        cout<<"Enter your city code"<<endl;
        cin>>code;
        cout<<"Type in your address"<<endl;
        cin>>add;
        cout<<"Enter your hindi typing speed"<<endl;
        cin>>hindisp;
        cout<<"Enter your english typing speed"<<endl;
        cin>>englishsp;
    }

};
class data:public typist
{
    public:
    void display()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"City code: "<<code<<endl;
        cout<<"Permanant address: "<<add<<endl;
        cout<<"Hindi typing speed: "<<hindisp<<endl;
        cout<<"English typing speed: "<<englishsp<<endl;
    }
};
int main()
{
    data obj;
    obj.input();
    obj.display();      
    return 0;
}