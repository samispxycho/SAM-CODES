#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}Node;

void reverse(Node **head){
    Node *prev=NULL;
    Node *curr=*head;
    Node *next=NULL;
    while(curr!=NULL){
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
    }
    *head=prev;
}

void display(Node *head){
    while(head!=NULL){
        printf("%d->",head->data);
        head=head->next;
    }
}

int main(){

    Node *present=NULL;
    Node *left=NULL;

    int ch;
    do{
        printf("Enter 1 to insert a node\nEnter 2 to reverse a list\nEnter 3 to display\n\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:
                present=(Node*)malloc(sizeof(Node*));
                if(present!=NULL){
                    int ele;
                    printf("Enter element: ");
                    scanf("%d",&ele);
                    present->data=ele;

                    present->next=left;
                    left=present;
                }
                break;
            case 2:
                reverse(&left);
                break;
            case 3:
                display(left);
                break;
        }
    }while(ch<=3);

    return 0;
}
