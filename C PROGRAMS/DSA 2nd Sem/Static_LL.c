#include<stdio.h>

struct list{
    int data;
    struct list *next;
};

int main(){

    struct list A,B,C;

    A.data=10;
    B.data=20;
    C.data=30;

    A.next=&B;
    B.next=&C;
    C.next=NULL;

    printf("%d ",A.data);
    printf("%d ",B.data);
    printf("%d ",C.data);

    printf("%d ",A.next);
    printf("%d",&B);

    return 0;
}