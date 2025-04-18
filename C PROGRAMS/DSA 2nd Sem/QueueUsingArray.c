#define MAX 5
#include<stdio.h>

void enquee(int queue[],int *front,int *rear){
    if(*rear==MAX-1){
        printf("Queue is full\n");
        return;
    }

    int ele;
    printf("Enter element: ");
    scanf("%d",&ele);

    *rear+=1;
    queue[*rear]=ele;

    if(*front==-1)*front=0;

}

void dequee(int queue[],int *front,int *rear){
    if(*rear==-1){
        printf("Queue is empty\n");
        return;
    }

    int ele=queue[*front];
    printf("Removed element: %d",ele);

    if(*front==*rear){
        *front=*rear=-1;
    }else{
        *front+=1;
    }
}

void display(int queue[],int *front,int *rear){
    for(int i=*front;i<=*rear;i++){
        printf("%d ",queue[i]);
    }
}

int main(){

    int queue[MAX];
    int front=0;
    int rear=0;

    int ch;
    while(ch<=3){
        printf("Enter 1 to add\nEnter 2 to remove\nEnter 3 to display");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                enquee(queue,&front,&rear);
                break;
        }
    }



    return 0;
}