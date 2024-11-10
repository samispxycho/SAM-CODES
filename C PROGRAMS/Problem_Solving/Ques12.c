#include<stdio.h>
int main(){

    int n;
    printf("Enter a number: ");
    scanf("%d",&n);

    int sum = 0;
    int i;

    for(i=1; i<(2*n); i+=2){
        sum += i;
    }
    
    printf("Sum of series 1 + 3 + 5 + 7 +....(2*%d)-1 is: %d",n,sum);

    return 0;
}