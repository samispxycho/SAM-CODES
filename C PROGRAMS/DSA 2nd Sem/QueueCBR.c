#define MAX 5
#include<stdio.h>
#include<stdlib.h>

void enqueue(int queue[],int *front,int *rear){
    if(*rear==MAX-1){
        printf("Queue is full");
        return;
    }
    int ele;
    printf("Enter element to enqueue: ");
    scanf("%d",&ele);

    *rear=*rear+1;
    queue[*rear]=ele;

    if(*front==-1)*front=0;
}

void dequeue(int queue[],int *front,int *rear){
    if(*front==-1){
        printf("Queue is empty\n");
        return;
    }
    printf("Dequeued element is: %d",queue[*front]);
    if(*front==*rear){
        *front=*rear=-1;
    }else{
        *front=*front+1;
    }
}

void display(int queue[],int front,int rear){
    if(front==-1){
        printf("Queue is empty\n");
        return;
    }
    int i;
    for(i=front;i<=rear;i++){
        printf("%d \n",queue[i]);
    }
}

void peek(int queue[],int front){
    if(front==-1){
        printf("Queue is empty\n");
        return;
    }
    printf("Peeked element is: %d\n",queue[front]);
}

int main(){

    int queue[MAX];
    int front=-1;
    int rear=-1;

    int choice;
    do
    {
        printf("\nEnter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4 to peek\nEnter 5 to exit");
        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice){
            case 1:
                enqueue(queue,&front,&rear);
                break;
            case 2:
                dequeue(queue,&front,&rear);
                break;
            case 3:
                display(queue,front,rear);
                break;
            case 4:
                peek(queue,front);
                break;
            case 5:
                exit(0);
        }

    }while(choice<=5);

    return 0;
}