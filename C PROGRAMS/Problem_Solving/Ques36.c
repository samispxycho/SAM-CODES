#include<stdio.h>
#include<stdlib.h>

struct Employee{
    char name[20];
    char department[20];
    int id;
    int salary;
}typedef emp;

int main(){

    int n;
    printf("Enter number of employees: ");
    scanf("%d",&n);

    emp *ptr;
    ptr = (emp*)malloc(n*sizeof(emp));

    for(int i=0;i<n;i++){
        fflush(stdin);
        printf("Enter name: ");
        gets(ptr[i].name);
        fflush(stdin);
        printf("\nEnter department: ");
        gets(ptr[i].department);
        fflush(stdin);
        printf("\nEnter id: ");
        scanf("%d",&ptr[i].id);
        fflush(stdin);
        printf("\nEnter salary: ");
        scanf("%d",&ptr[i].salary);
    }

    printf("\n\n\n\n");

    for(int i=0;i<n;i++){
        printf("Name: %s",ptr[i].name);
        printf("\nName: %s",ptr[i].department);
        printf("\nName: %d",ptr[i].id);
        printf("\nName: %d",ptr[i].salary);
    }


    return 0;
}