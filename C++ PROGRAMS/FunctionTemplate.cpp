//Function template is also known as generic function

#include<iostream>
using namespace std;
template<class T>

void display(T a,T b)
{
    cout<<"First value you entered is "<<a<<endl;
    cout<<"Second value you entered is "<<b<<endl;
}
int main()
{
    int num1=100;
    int num2=200;
    display(num1,num2);

    float deci1=100.87;
    float deci2=89.14;
    display(deci1,deci2);

    char s='s';
    char u='u';
    display(s,u);
    return 0;
}