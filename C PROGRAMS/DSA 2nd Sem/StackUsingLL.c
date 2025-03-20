#include<stdio.h>
#include<stdlib.h>

struct stack{
    int data;
    struct stack *next;
};

struct stack* push(struct stack *top){
    struct stack *present=NULL;
    present=(struct stack*)malloc(sizeof(struct stack));
    if(present!=NULL){
        int ele;
        printf("Enter element to push: ");
        scanf("%d",&ele);

        present->data=ele;
        present->next=top;
        top=present;
    }
    return top;
}

struct stack *pop(struct stack *top){
    struct stack *present=NULL;
    present=top;
    int ele=top->data;
    printf("Popped element is: %d",ele);
    top=top->next;
    free(present);
    return top;
}

void display(struct stack *top){
    while(top!=NULL){
        printf("%d ",top->data);
        top=top->next;
    }
}

void peek(struct stack *top){
    printf("Peeked element is: %d",top->data);
}

int main(){

    struct stack *top=NULL;

    int choice;
    
    do{
        printf("\nEnter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4 to peek\nEnter 5 to exit");
        scanf("%d",&choice);
        switch(choice){
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
            case 5:
                exit(0);
        }

    }while(choice<=4);

    return 0;
}