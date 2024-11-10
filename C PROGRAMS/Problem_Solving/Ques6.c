#include<stdio.h>
#include<math.h>

int main(){

    int num;
    printf("Enter a number: ");
    scanf("%d",&num);

    int count=0;
    int temp = num;
    while(temp>0){
        count++;
        temp/=10;
    }

    printf("%d",count);

    temp = num;

    int sum = 0;
    while(temp > 0){
        int d = temp % 10;
        sum=sum+ (int)pow(d,count);
        temp /= 10;
    }

    if(sum == num){
        printf("Armstrong number.");
    }else{
        printf("Not armstrong");
    }

    return 0;
}