#include<stdio.h>

int main(){

    int eng,hindi,maths;
    printf("Enter marks: ");
    scanf("%d%d%d", &eng,&hindi,&maths);

    printf("\nMarks in english: %d",eng);
    printf("\nMarks in hindi %d",hindi);
    printf("\nMarks in maths: %d",maths);

    int total = eng+hindi+maths;
    printf("\nTotal marks: %d /300", total);

    float percentage = total/3;
    printf("\nPercentage scored: %f percent", percentage);

    return 0;
}