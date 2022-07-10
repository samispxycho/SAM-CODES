//Use of function template

#include<iostream>
using namespace std;

template<class T>
void display(T a, T b)
{
    cout<<"Value of a is "<<a<<", value of b is "<<b<<endl;
}

int main()
{
    int x=100;
    int y=90;

    float r=8.10;
    float s=9.98;

    char i='S';
    char j='U';

    display(x,y);
    display(r,s);
    display(i,j);

    return 0;
}