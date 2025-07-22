#include<stdio.h>
#include<stdlib.h>

typedef struct queue{
    int data;
    struct queue *next;
}q;

q* addElement(q* right){
    q* present=NULL;
    present=(q*)malloc(sizeof(q));
    if(present!=NULL){
        int ele;
        printf("Enter element to add: ");
        scanf("%d",&ele);

        present->data=ele;
        present->next=NULL;

        if(right==NULL){
            right=present;
        }else{
            right->next=present;
            right=right->next;
        }
    }
    return right;
}

q* removeElement(q* left,q *right){
    if(right==NULL){
        printf("Queue is empty\n");
        return left;
    }
    q* present=left;
    printf("Removed element is: %d",present->data);
    if(left==right){
        left=NULL;
    }else{
        left=left->next;
    }
    free(present);
    return left;
}

void display(q* left,q* right){
    if(right==NULL){
        printf("Queue is empty\n");
        return;
    }
    while(left!=NULL){
        printf("%d ",left->data);
        left=left->next;
    }
}

int main(){

    q* left=NULL;
    q* right=NULL;

    int ch;
    do{
        printf("\nEnter 1 to add\nEnter 2 to remove\nEnter 3 to display\n\nEnter choice: ");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                right=addElement(right);
                if(left==NULL)left=right;
                break;
            case 2:
                left=removeElement(left,right);
                if(left==NULL)right=NULL;
                break;
            case 3:
                display(left,right);
                break;
        }

    }while(ch<=3);

    return 0;
}