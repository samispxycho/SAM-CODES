#include<stdio.h>
#include<stdlib.h>

int main(){

    int *ptr;
    ptr=(int *)malloc(4);
    *ptr = 10;
    printf("%d",*ptr);


    int *ptr1;
    ptr1 =(int *)calloc(5,4);
    *(ptr+0) = 100;
    *(ptr+1) = 200;
    *(ptr+2) = 300;
    *(ptr+3) = 400;
    *(ptr+4) = 500;
    printf("\n%d",*(ptr+0));

    int *ptr2;
    ptr2 =(int *)malloc(4);
    *ptr = 100;
    
    double *ptr3;
    ptr3 = realloc(ptr,10);


    int *ptr4;
    ptr4 = (int*)malloc(4);
    printf("Enter a value: ");
    scanf("%d",ptr4);

    printf("%d",*ptr4);

    free(ptr);
    free(ptr1);
    free(ptr2);
    free(ptr3);
    free(ptr4);

    return 0;
}