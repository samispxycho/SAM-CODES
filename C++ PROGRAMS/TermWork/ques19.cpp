//Program for exception handeling using try and catch

#include<iostream>
using namespace std;
int main()
{
    int numerator,denominator,result;
    cout<<"Enter the value of numerator"<<endl;
    cin>>numerator;
    cout<<"Enter the value of denominator"<<endl;
    cin>>denominator;

    try
    {
        if(denominator==0)
        {
            throw denominator;
        }
        else
        {
            result=numerator/denominator;
            cout<<"The result is "<<result<<endl;
        }
    }

    catch(int x)
    {
        cout<<"Division by zero is invalid and not allowed."<<endl;
    }
    return 0;
}