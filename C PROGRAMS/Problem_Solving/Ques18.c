#include<stdio.h>

int fact(int num){
    int res = 1;
    int i;

    for(i=1;i<=num;i++){
        res = res * i;
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
        if(i%2==0){
            sum = sum - fact(i);
        }else{
            sum = sum + fact(i);
        }
    }

    printf("%d",sum);
    

    return 0;
}