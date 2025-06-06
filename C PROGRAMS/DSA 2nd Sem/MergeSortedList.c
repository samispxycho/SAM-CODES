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

void insertSorted(Node **head,int ele){
    Node *newNode=createNode(ele);

    if(*head==NULL || ele < (*head)->data){
        newNode->next=*head;
        *head=newNode;
        return;
    }

    Node *curr=*head;
    while(curr->next!=NULL && curr->next->data < ele){
        curr=curr->next;
    }
    newNode->next=curr->next;
    curr->next=newNode;
}

Node *mergeList(Node *list1,Node *list2){
    if(!list1)return list2;
    if(!list2)return list1;

    if(list1->data < list2->data){
        list1->next=mergeList(list1->next,list2);
        return list1;
    }else{
        list2->next=mergeList(list1,list2->next);
        return list2;
    }

}

void display(Node *head){
    while(head!=NULL){
        printf("%d",head->data);
        head=head->next;
    }
}

int main(){

    Node *list1=NULL;
    Node *list2=NULL;
    Node *sorted=NULL;

    int ele;int ele2;

    int ch;
    do{
        printf("Enter 1 to insert in list1\nEnter 2 to insert in list 2\nEnter 3 to merge the lists\nEnter 4 to display the list\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:
                printf("Enter element to enter: ");
                scanf("%d",&ele);
                insertSorted(&list1,ele);
                break;
            case 2:
                printf("Enter element to enter: ");
                scanf("%d",&ele2);
                insertSorted(&list2,ele2);
                break;
            case 3:
                sorted=mergeList(list1,list2);
                break;
            case 4:
                display(sorted);
                break;
        }
    }while(ch<=4);

    return 0;
}
