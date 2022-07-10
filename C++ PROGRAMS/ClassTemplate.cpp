//Use of class template

#include<iostream>
using namespace std;

template<class T>
class test
{
    T a,b;
    public:
    test(T x, T y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        cout<<"Value of a is "<<a<<", value of b is "<<b<<endl;
    }
};

int main()
{
    test <int> obj(70,80);      //class_name <data_type> class_object 
    obj.display();
    return 0;
}