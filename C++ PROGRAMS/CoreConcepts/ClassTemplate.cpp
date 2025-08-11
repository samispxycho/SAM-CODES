//Class template is also known as generic class

#include<iostream>
using namespace std;
template<class T>

class pxycho
{
    T a; T b;
    public:
    void input(T x, T y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        cout<<"First value is "<<a<<endl;
        cout<<"Second value is "<<b<<endl;
    }

};
int main()
{
    pxycho <int> obj;
    obj.input(100,200);
    obj.display();

    pxycho <float> obj1;
    obj1.input(100.87,200.98);
    obj1.display();

    pxycho <char> obj2;
    obj2.input('s','u');
    obj2.display();
    return 0;
}