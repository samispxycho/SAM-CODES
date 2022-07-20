//Percentage calculation using multi-level inheritance

#include<iostream>
using namespace std;

#include<iostream>
using namespace std;

class subjects
{
    public:
    int english,hindi,science,socials,computers;
};

class data:public subjects
{
    public:
    void input()
    {
        cout<<"Enter marks scored in English"<<endl;
        cin>>english;
        cout<<"Enter marks scored in Hindi"<<endl;
        cin>>hindi;
        cout<<"Enter marks scored in Science"<<endl;
        cin>>science;
        cout<<"Enter marks scored in Socials"<<endl;
        cin>>socials;
        cout<<"Enter marks scored in Computers"<<endl;
        cin>>computers;
    }
};

class calc:public data
{
    public:
    int sum,perc;

    void total()
    {
        sum=english+hindi+science+socials+computers;
        perc=sum*100/500;
    }

    void display()
    {
        cout<<"Total marks: "<<sum<<endl;
        cout<<"Your overall percentage: "<<perc<<endl;
    }
};
int main()
{
    calc obj[10];
    for(int i=0;i<10;i++)
    {
        cout<<"Enter marks of student number "<<i+1<<endl;
        obj[i].input();
        obj[i].total();
    }

    for(int i=0;i<10;i++)
    {
        cout<<"Details of student number "<<i+1<<endl;
        obj[i].display();
    }
    cout<<endl<<endl;
    
    return 0;
}