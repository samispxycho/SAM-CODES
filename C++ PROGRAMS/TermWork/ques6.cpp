//Check whether a number is prime or not using parameterized constructor.

#include<iostream>
using namespace std;

class prime
{
    int num, count;
    public:
    prime(int x)
    {
        num=x;
        count=1;
    }

    int calc()
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count=0;
                break;
            }
            else
            {
                count=1;
            }
        }
        return count;
    }

    void output()
    {
        if(count==1)
        {
            cout<<"Number entered is a prime number"<<endl;
        }
        else
        {
            cout<<"NUmber entered is not a prime number"<<endl;
        }
    }
};  
int main()
{
    int x;
    cout<<"Enter a number"<<endl;
    cin>>x;

    prime obj(x);
    obj.calc();
    obj.output();   
    return 0;
}