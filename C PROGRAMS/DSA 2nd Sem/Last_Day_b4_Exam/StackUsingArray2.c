#define MAX 10
#include<stdio.h>

void push(int stack[], int *top){
    if(*top == MAX-1){
        printf("Stack is full\n");
        return;
    }

    int ele;
    printf("Enter element to push: ");
    scanf("%d",&ele);

    *top+=1;
    stack[*top]=ele;
    return;
}

void pop(int stack[],int *top){
    if(*top==-1){
        printf("Stack is empty\n");
        return;
    }

    printf("Popped element is: %d",stack[*top]);
    *top=*top-1;
    return;
}

void display(int stack[],int top){
    if(top==-1){
        printf("Stack is empty\n");
        return;
    }

    for(int i=0;i<=top;i++){
        printf("%d ",stack[i]);
    }
    printf("\n");
}

void peek(int stack[],int top){
    if(top==-1){
        printf("Stack is empty\n");
        return;
    }

    printf("Top element is: %d\n",stack[top]);
}

int main(){
    int stack[MAX];
    int top=-1;
    int choice=0;

    do{

        printf("\nEnter 1 to push an element\nEnter 2 to pop an element\nEnter 3 to display the elements\nEnter 4 to peek\n\nEnter your choice: ");

        scanf("%d",&choice);

        switch(choice){
            case 1:
                push(stack,&top);
                break;
            case 2:
                pop(stack,&top);
                break;
            case 3:
                display(stack,top);
                break;
            case 4:
                peek(stack,top);
                break;
        }
    }while(choice<=4);

}