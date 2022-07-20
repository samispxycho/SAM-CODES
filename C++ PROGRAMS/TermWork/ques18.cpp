//Program to find the cube using function template

#include<iostream>
using namespace std;
template<class T>

T cube(T x)
{
    return x*x*x;
}
int main()
{
    int s=cube<int>(10);
    cout<<"Value of int type cube is "<<s<<endl;

    float y=cube<float>(10.2);
    cout<<"Value of float type cube is "<<y<<endl;

    return 0;
}