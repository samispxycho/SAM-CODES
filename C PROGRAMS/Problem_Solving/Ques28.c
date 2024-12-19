#include<stdio.h>
#include<string.h>

union student{
    int roll;
    char name[20];
}typedef student;

int main(){

    student stu1;
    stu1.roll = 35;
    strcpy(stu1.name,"Roronoa Zoro");
    -
    printf("Roll Number is: %d",stu1.roll);
    printf("\nName is: %s",stu1.name);



    return 0;
}