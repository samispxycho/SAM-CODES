//Function to add 3 numbers using function template

#include<iostream>
using namespace std;
template<class T>

T add(T x, T y)
{
    return x+y;
}
int main()
{
    int x=add<int>(100,200);
    cout<<"Addition of two integer values 100 and 200 is "<<x<<endl;

    float y=add<float>(10.20,20.17);
    cout<<"Addition of two float values 10.20 and 20.17 is "<<y<<endl;

    double z=add<double>(9345.4554, 5564.8724);
    cout<<"Addition of two double type values 9345.4554 and 5564.8724 is "<<z<<endl;
    
    return 0;
}