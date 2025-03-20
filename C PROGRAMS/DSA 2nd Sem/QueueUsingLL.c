#include<stdio.h>
#include<stdlib.h>

typedef struct queue{
    int data;
    struct queue *next;
}q;

q* insert(q *right){
    q *present=NULL;
    present=(q*)malloc(sizeof(q));
    if(present!=NULL){
        int ele;
        printf("Enter element to insert: ");
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

q* delete(q *left, q *right){
    q *temp=left;
    printf("Deleted element is: %d",left->data);
    if(left==right){
        left=NULL;
    }else{
        left=left->next;
    }
    free(temp);
    return left;
}

void display(q *left){
    while(left!=NULL){
        printf("%d ",left->data);
        left=left->next;
    }
}

void peek(q *left){
    printf("Peeked element is: %d",left->data);
}

int main(){
    
    q *left=NULL;
    q *right=NULL;

    int choice;

    do{
        printf("\nEnter 1 to insert\nEnter 2 to delete\nEnter 3 to display\nEnter 4 to peek\nEnter 5 to exit");
        scanf("%d",&choice);

        switch(choice){
            case 1:
                right=insert(right);
                if(left==NULL){
                    left=right;
                }
                break;
            case 2:
                left=delete(left,right);
                if(left==NULL)right=NULL;
                break;
            case 3:
                display(left);
                break;
            case 4:
                peek(left);
                break;
            case 5:
                exit(0);

        }
    }while(choice<=5);

    return 0;
}