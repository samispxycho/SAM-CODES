#include<stdio.h>

int gcd(int num1,int num2){
    if(num2==0){
        return num1;
    }
    return gcd(num2,num1%num2);
}

int main(){

    int num1,num2;
    printf("Enter two numbers: ");
    scanf("%d %d",&num1,&num2);

    int result = gcd(num1,num2);
    printf("GCD of the two numbers is: %d",result);

    return 0;
}