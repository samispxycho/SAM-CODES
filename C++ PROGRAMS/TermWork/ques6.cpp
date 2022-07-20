//Program to check whether a number is prime or not

#include<iostream>
using namespace std;

class prime
{
    public:
    int num,c,i;
    prime(int x)
    {
        num=x;
        c=1;

        for(i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                c=0;
                break;
            }
            else
            {
                c=1;
                break;
            }
        }
    }

    void display()
    {
        if(c==1)
        {
            cout<<"Number entered is a prime number"<<endl;
        }
        else
        {
            cout<<"Number entered is not a prime number"<<endl;
        }
    }
};
int main()
{
    int j;
    cout<<"Enter a number to check whether its prime or not"<<endl;
    cin>>j;

    prime obj(j);
    obj.display();

    return 0;
}