#include<stdio.h>
int main(){

    int num1,num2;
    printf("Enter two numbers: ");
    scanf("%d%d",&num1,&num2);

    int min;
    if(num1 < num2) min = num1;
    else min = num2;

    int i;
    int hcf=1;
    for(i=1;i<=num1;i++){
        if(num1 % i==0 && num2 % i==0){
            hcf = i;
        }
    }
    printf("HCF is : %d\n",hcf);
    printf("LCM is: %d", (num1 * num2)/hcf);

    

    return 0;
}