#include<stdio.h>

int main(){

    int h1,m1,s1;
    printf("Enter time 1: ");
    scanf("%d%d%d",&h1,&m1,&s1);

    int h2,m2,s2;
    printf("Enter time 2: ");
    scanf("%d%d%d",&h2,&m2,&s2);

    int total_s,total_m,total_h;

    total_s = s1 + s2;
    total_m = m1 + m2 + total_s/60;
    total_h = h1 + h2 + total_m/60;

    total_s = total_s % 60;
    total_m = total_m % 60;

    printf("%d:%d:%d", total_h,total_m,total_s);

    return 0;
}