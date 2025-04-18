#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}queue;

queue *add(queue *right){
    queue *curr=NULL;
    curr=(queue*)malloc(sizeof(queue));
    if(curr!=NULL){
        int ele;
        printf("Enter data to add: ");
        scanf("%d",&ele);

        curr->data=ele;
        curr->next=NULL;

        if(right==NULL){
            right=curr;
        }else{
            right->next=curr;
            right=right->next;
        }
    }

    return right;
}

queue *delete(queue *left,queue *right){
    queue *curr=left;
    if(left==right){
        left=NULL;
    }else{
        left=left->next;
    }
    free(curr);
    return left;
}

void display(queue *left,queue *right){
    while(left!=NULL){
        printf("%d ",left->data);
        left=left->next;
    }
}

int main(){

    queue *left=NULL;
    queue *right=NULL;

    int choice;
    while(choice<3){
        printf("Enter 1 to add\nEnter 2 to display\n\n");
        scanf("%d",&choice);

        switch(choice){
            case 1:
                right=add(right);
                if(left==NULL)left=right;
                break;
            case 2:
                left=delete(left,right);
                if(left==NULL)right=NULL;
                break;
            case 3:
                display(left,right);
                break;
                
        }
    }

    return 0;
}