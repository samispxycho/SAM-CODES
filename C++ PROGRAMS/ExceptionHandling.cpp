//To display an error message whenever a number is divided by zero.

#include<iostream>
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter your first number"<<endl;
    cin>>a;
    cout<<"Enter your second number"<<endl;
    cin>>b;

    try
    {
        if(b==0)
        {
            throw (b);
        }
        else
        {
            c=a/b;
            cout<<"Your output is "<<c<<endl;
        }
    }
    catch(int x)
    {
        cout<<"Can't divide by "<<x<<endl;
    }
    return 0;
}