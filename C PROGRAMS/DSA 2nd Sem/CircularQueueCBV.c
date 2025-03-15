#define MAX 5
#include<stdio.h>
#include<stdlib.h>

int enqueue(int queue[],int front,int rear){
    if((rear+1)%MAX==front){
        printf("Queue is full\n");
        return rear;
    }
    int ele;
    printf("Enter element to enqueue: ");
    scanf("%d",&ele);

    rear=(rear+1)%MAX;
    queue[rear]=ele;

    return rear;
}

int dequeue(int queue[],int front,int rear){
    if(front==-1){
        printf("Queue is empty\n");
        return front;
    }
    if(front==rear){
        printf("Dequeued element is: %d",queue[front]);
        front=-1;
    }else{
        printf("Dequeued element is: %d\n",queue[front]);
        front=(front+1)%MAX;
    }

    return front;
}

void display(int queue[],int front,int rear){
    if(front==-1){
        printf("Queue is empty\n");
        return;
    }
    while(front!=rear){
        printf("%d ",queue[front]);
        front=(front+1)%MAX;
    }
    printf("%d",queue[front]);
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
                rear=enqueue(queue,front,rear);
                if(front==-1)front=0;
                break;
            case 2:
                front=dequeue(queue,front,rear);
                if(front==-1)rear=-1;
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