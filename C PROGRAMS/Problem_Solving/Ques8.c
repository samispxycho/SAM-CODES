#include<stdio.h>
int main(){

    int n;
    printf("Enter a number: ");
    scanf("%d",&n);

    int sum = 0;

    int i;
    for(i=1;i<=n;i++){
        sum += i;
    }

    printf("Sum of series: 1 + 2 + 3 +....%d is: %d",n,sum);

    return 0;
}