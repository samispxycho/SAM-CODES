#define MAX 5
#include<stdio.h>
#include<stdlib.h>

int push(int stack[],int top){

    if(top>=MAX-1){
        printf("Stack Overflow\n");
        return top;
    }

    int ele;
    printf("Enter element to push: ");
    scanf("%d",&ele);

    top=top+1;
    stack[top]=ele;
    return top;
}

int pop(int stack[],int top){
    if(top==-1){
        printf("Stack Underflow\n");
        return top;
    }
    printf("Popped element: %d\n",stack[top]);
    top=top-1;

    return top;
}

void display(int stack[],int top){
    if(top==-1){
        printf("Stack is Empty\n");
        return;
    }
    int i;
    for(i=top;i>=0;i--){
        printf("%d ",stack[i]);
    }
    printf("\n");
}
void peek(int stack[],int top){
    if(top==-1){
        printf("Stack is empty\n");
        return;
    }
    printf("Peeked Element is: %d\n",stack[top]);
}

int main(){

    int stack[MAX];
    int top=-1;

    int choice;
    do{
        printf("\nEnter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4 to peek\nEnter 5 to ext");
        printf("\n\nEnter your choice: ");
        scanf("%d",&choice);

        switch(choice){
            case 1:
                top=push(stack,top);
                break;
            case 2:
                top=pop(stack,top);
                break;
            case 3:
                display(stack,top);
                break;
            case 4:
                peek(stack,top);
                break;
            case 5:
                exit(0);
        }

    }while(choice<=5);

    return 0;
}