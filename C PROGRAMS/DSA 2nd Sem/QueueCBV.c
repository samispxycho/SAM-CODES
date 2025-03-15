#define MAX 5
#include<stdio.h>
#include<stdlib.h>

int enquee(int queue[],int front,int rear){

    if(rear>=MAX-1){
        printf("Queue is full\n");
        return rear;
    }else{
        int ele;
        printf("Enter element to enquee: ");
        scanf("%d",&ele);
        rear=rear+1;
        queue[rear]=ele;
    }
    return rear;
}

int dequee(int queue[],int front,int rear){
    if(rear==-1){
        printf("Queue is empty\n");
        return rear;
    }else{
        printf("Dequeed element is: %d",queue[front]);
        if(front==rear)front=-1;
        else front++;
    }
    return front;
}

void display(int queue[],int front,int rear){
    if(rear==-1){
        printf("Queue is empty\n");
        return;
    }
    int i;
    for(i=front;i<=rear;i++){
        printf("%d ",queue[i]);
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
        printf("\nEnter 1 to enquee\nEnter 2 to dequee\nEnter 3 to display\nEnter 4 to peek\nEnter 5 to ext");
        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice){
            case 1:
                rear=enquee(queue,front,rear);
                if(front==-1)front=0;
                break;
            case 2:
                front=dequee(queue,front,rear);
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