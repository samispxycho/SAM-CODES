#include<stdio.h>

int main(){

    int n;
    printf("Enter a number: ");
    scanf("%d",&n);

    int sum = 0;
    int i;

    for(i=2;i<=(2*n);i+=2){
        sum = sum + i;
    }

    printf("Sum of series 2 + 4 + 6 +....2*%d is: %d",n,sum);

    return 0;
}