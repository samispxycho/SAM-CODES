#include<stdio.h>
#include<math.h>

void main(){

    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    //sum of digits 
    int temp = num;
    int sum = 0;
    while(temp > 0){
        sum = sum + (temp%10);
        temp = temp / 10;
    }

    int reverse_sum = 0;
    temp = sum;
    while(temp > 0){
        int d = temp%10;
        reverse_sum = reverse_sum * 10 + d;
        temp = temp/10;
    }

    if((sum *  reverse_sum) == num)printf("Magic number");
    else printf("Not a magic number");


}