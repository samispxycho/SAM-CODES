#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}Node;

Node *createNode(int ele){
    Node *temp=NULL;
    temp=(Node*)malloc(sizeof(Node));
    temp->data=ele;
    temp->next=NULL;
    return temp;
}

void insertPosition(Node **head,int ele,int position){
    Node *newNode=createNode(ele);
    if(position==1){
        newNode->next=*head;
        *head=newNode;
        return;
    }
    Node *curr=*head;
    for(int i=1;i<position-1;i++){
        curr=curr->next;
    }
    newNode->next=curr->next;
    curr->next=newNode;
}

void display(Node *head){
    while(head!=NULL){
        printf("%d ",head->data);
        head=head->next;
    }
}

int main(){

    Node *list=NULL;

    int ele;
    int position;

    int ch;
    do{
        printf("Enter 1 to insert data at specific position\nEnter 2 to display\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:
                printf("Enter element to enter: ");
                scanf("%d",&ele);
                printf("Enter position to enter: ");
                scanf("%d",&position);
                insertPosition(&list,ele,position);
                break;
            case 2:
                display(list);
                break;
        }
    }while(ch<=2);

    return 0;
}
