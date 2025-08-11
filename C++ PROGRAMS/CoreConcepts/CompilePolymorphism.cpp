#include<iostream>
using namespace std;

class pxycho
{
    float a,b;
    public:
    void show(int x,int y)
    {
        a=x;
        b=y;
        cout<<"Value of A "<<a<<" and value of B "<<b<<endl;
    }

    void show(float x,float y)
    {
        a=x;
        b=y;
        cout<<"Value of A "<<a<<" and value of B "<<b<<endl;
    }
};
int main()
{
    pxycho obj;
    obj.show(10,20);
    obj.show(10.12f,20.18f);
    return 0;
}