#include<stdio.h>
#include<stdlib.h>

typedef struct stack{
    int data;
    struct stack *next;
}stack;

stack* push(stack *top){
    stack *present=NULL;
    present=(stack*)malloc(sizeof(stack));
    if(present!=NULL){
        int ele;
        printf("Enter data to push: ");
        scanf("%d",&ele);

        present->data=ele;
        present->next=top;
        top=present;

        return top;
    }
}

stack* pop(stack *top){
    if(top==NULL){
        printf("Stack is empty\n");
        return top;
    }

    stack* present=top;
    printf("Popped element is: %d",present->data);
    top=top->next;
    free(present);

    return top;
}

void display(stack* top){
    if(top==NULL){
        printf("Stack is empty\n");
        return;
    }
    while(top!=NULL){
        printf("%d ",top->data);
        top=top->next;
    }
}

void peek(stack *top){
    if(top==NULL){
        printf("Stack is empty\n");
        return;
    }
    printf("%d",top->data);
}

int main(){

    stack *top=NULL;

    int ch=0;
    do{
        printf("Enter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4 to peek\n\nEnter your choice: ");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                top=push(top);
                break;
            case 2:
                top=pop(top);
                break;
            case 3:
                display(top);
                break;
            case 4:
                peek(top);
                break;
        }

    }while(ch<=4);

    return 0;
}