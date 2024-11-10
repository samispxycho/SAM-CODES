#include<stdio.h>

int fact(int n){
    int res = 1;
    int i;

    for(i=1;i<=n;i++){
        res *= i;
    }
    return res;
}


int main(){

    int n;
    printf("Enter a number: ");
    scanf("%d",&n);

    int sum = 0;
    int i;

    for(i=1;i<=n;i++){
        sum = sum + fact(i);
    }

    printf("%d",sum);

    


    return 0;
}