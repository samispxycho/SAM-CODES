#include<stdio.h>

struct date{
    int d;
    int m;
    int y;
};

int main(){

    //to insert data-method 1
    struct date today={17,4,2004};

    //to insert data-method 2
    struct date today2;
    today2.d=10;
    today2.m=12;
    today.y=2015;

    //to insert data-from user
    struct date today3;
    printf("Enter today's date: ");
    scanf("%d/%d/%d", &today3.d,&today3.m,&today3.y);

    //to print structure values
    printf("%d/%d/%d",today3.d,today3.m,today3.y);

    //to copy date into another structure-method 1
    struct date today4;
    today4=today3;

    //to copy data into another structure-method2
    struct date today5;
    today5.d=today3.d;
    today5.m=today3.m;
    today5.y=today3.y;


    return 0;
}