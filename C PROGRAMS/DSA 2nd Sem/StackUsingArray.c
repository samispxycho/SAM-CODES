#define MAX 5
#include<stdio.h>

int push(int stack[],int top){
    if(top==MAX-1){
        printf("Stack is full\n");
        return top;
    }

    int ele;
    printf("Enter value to push: ");
    scanf("%d",&ele);

    top+=1;
    stack[top]=ele;
    return top;
}

int pop(int stack[],int top){
    if(top==-1){
        printf("Stack is empty\n");
        return top;
    }
    int ele=stack[top];
    printf("Popped element is: %d",ele);
    top-=1;

    return top;
}

void display(int stack[],int top){
    for(int i=0;i<=top;i++){
        printf("%d ",stack[i]);
    }
}

int main(){

    int stack[MAX];
    int top=-1;
    int ch;
    
    while(ch<=4){
        printf("Enter 1 to push\nEnter 2 to pop\nEnter 3 to display");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                top=push(stack,top);
                break;
            case 2:
                top=pop(stack,top);
                break;
            case 3:
                display(stack,top);
                break;
            
        }

    }

    return 0;
}