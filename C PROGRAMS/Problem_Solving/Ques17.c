#include<stdio.h>
#include<math.h>


int fact(int num){
    int res=1;
    int i;
    for(i=1;i<=num;i++){
        res *= i;
    }
    return res;
}

int main(){

    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    int sum = 1;
    int i;

    for(i=2;i<=n;i++){
        sum = sum + (pow(i,i-1) / fact(i));
    }

    printf("%d",sum);



    return 0;
}