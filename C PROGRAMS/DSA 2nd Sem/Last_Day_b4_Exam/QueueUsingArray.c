#define MAX 10
#include<stdio.h>

int add(int queue[],int front,int rear){
    if(rear==MAX-1){
        printf("Queue is full\n");
        return rear;
    }

    int ele;
    printf("Enter element to add: ");
    scanf("%d",&ele);

    rear+=1;
    queue[rear]=ele;

    return rear;
}

int removee(int queue[],int front,int rear){
    if(rear==-1){
        printf("Queue is empty\n");
        return front;
    }

    printf("Removed element: %d",queue[front]);
    if(front==rear)front=-1;
    else front+=1;

    return front;
}

void display(int queue[],int front,int rear){
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
        printf("\nEnter 1 to add\nEnter 2 to remove\nEnter 3 to display\n\nEnter choice: ");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                rear=add(queue,front,rear);
                if(front==-1)front=0;
                break;
            case 2:
                front=removee(queue,front,rear);
                if(front==-1)rear=-1;
                break;
            case 3:
                display(queue,front,rear);
                break;
        }
    }while(ch<=3);


    return 0;
}