#include<stdio.h>
#include<stdlib.h>

typedef struct queue{
    int data;
    struct queue *next;
}queue;

queue* insert(queue* rear){
    queue* present=NULL;
    present=(queue*)malloc(sizeof(queue));
    if(present!=NULL){
        int ele;
        scanf("%d",&ele);

        present->data=ele;

        if(rear==NULL){
            rear=present;
        }else{
            rear->next=present;
            rear=rear->next;
        }
    }
    return rear;
}

queue* delete(queue* front,queue* rear){
    queue* present=front;
    
    if(front==rear){
        front=NULL;
    }else{
        front=front->data;
    }
    printf("Deleted %d",present->data);
    free(present);
    return front;
}

int main(){

    queue* front=NULL;
    queue* rear=NULL;

    int ch;
    do{
        printf("Enter 1 to add\nEnter 2 to remove\nEnter 3 to display\n");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                rear=insert(rear);
                if(front==NULL){
                    front=rear;
                }
                break;
            case 2:
                front=delete(front,rear);
                if(front=NULL){
                    rear=NULL;
                }
                break;
        }

    }while(ch<=3);

    return 0;
}