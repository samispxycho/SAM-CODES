#include<stdio.h>
int main(){

    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);

    int num = 1;
    int count = 0;

    while(count <= n){

        int temp=num;
        int reverse = 0;
        while(temp>0){
            int d = temp % 10;
            reverse=reverse*10 + d;
            temp = temp/10;
        }

        if(reverse == num){
            printf("%d", num);
            count++;
        }
        num++;

    }

    return 0;
}