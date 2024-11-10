#include<stdio.h>
int main(){

    int n;
    printf("Enter a number: ");
    scanf("%d",&n);

    int sum = 0;
    int i;

    for(i=1;i<=n;i++){
        sum = sum + (i*i);
    }

    printf("Sum of series 1 + 2^2 + 3^3 +.... %d^%d is: %d",n,n,sum);

    return 0;
}