#include<iostream>
using namespace std;

class animal
{
    public:
    virtual void eat()
    {
        cout<<"I'm eating generic food"<<endl;
    }
};

class cat:public animal
{
    public:
    void eat()
    {
        cout<<"I'm eating cat food"<<endl;
    }
};

class dog:public animal
{
    public:
    void eat()
    {
        cout<<"I'm eating dog food"<<endl;
    }
};

void function(animal *xyz)
{
    xyz->eat();
}

int main()
{
    animal *ptr;

    cat obj1;
    dog obj2;

    ptr=&obj1;
    function(ptr);

    ptr=&obj2;
    function(ptr);

    return 0;
}