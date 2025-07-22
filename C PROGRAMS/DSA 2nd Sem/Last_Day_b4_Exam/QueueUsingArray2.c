#define MAX 10
#include<stdio.h>

void addEle(int queue[],int *front,int *rear){
    if(*rear==MAX-1){
        printf("Queue is full\n");
        return;
    }
    int ele;
    printf("Enter element to add: ");
    scanf("%d",&ele);

    *rear+=1;
    queue[*rear]=ele;

    if(*front==-1)*front=0;
}

void removeEle(int queue[],int *front,int *rear){
    if(*rear==-1){
        printf("Queue is empty\n");
        return;
    }

    printf("Removed element: %d", queue[*front]);
    if(*front==*rear){
        *front=-1;
        *rear=-1;
    }else{
        *front+=1;
    }
}

void displayEle(int queue[],int front,int rear){
    if(rear==-1){
        printf("Queue is empty\n");
        return;
    }
    for(int i=front;i<=rear;i++){
        printf("%d ",queue[i]);
    }
}

int main(){

    int queue[MAX];
    int front=-1;
    int rear=-1;

    int ch;
    do{
        printf("\nEnter 1 to add element\nEnter 2 to remove element\nEnter 3 to display elements\n\nEnter choice: ");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                addEle(queue,&front,&rear);
                break;
            case 2:
                removeEle(queue,&front,&rear);
                break;
            case 3:
                displayEle(queue,front,rear);
                break;
        }
    }while(ch<=3);


    return 0;
}