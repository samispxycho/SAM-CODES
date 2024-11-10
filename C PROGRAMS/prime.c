#include<stdio.h>

void main(){

    int n;
    printf("Enter a year: ");
    scanf("%d", &n);

    int year;

    for(year=1;year<=n;year++){
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            printf("%d\n",year);
        }
    }

}