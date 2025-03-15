#define MAX 5
#include <stdio.h>
#include<stdlib.h>

void push(int stack[], int *top){
    if (*top == MAX - 1){
        printf("Stack Overflow");
        return;
    }

    int ele;
    printf("Enter element to push: ");
    scanf("%d", &ele);

    *top = *top + 1;
    stack[*top] = ele;
}

void pop(int stack[], int *top){
    if (*top == -1){
        printf("Stack is empty");
        return;
    }
    printf("Element popped is: %d", stack[*top]);
    *top = *top - 1;
}

void display(int stack[], int top){
    if (top == -1){
        printf("Stack is empty");
        return;
    }
    int i;
    for (i = top; i >= 0; i--){
        printf("%d ", stack[i]);
    }
}

void peek(int stack[],int top){
    if (top == -1){
        printf("Stack is empty");
        return;
    }
    printf("Peeked element is: %d",stack[top]);
}

int main()
{

    int stack[MAX];
    int top = -1;

    int choice;
    do
    {
        printf("\nEnter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4 to peek\nEnter 5 to ext");
        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice){
            case 1:
                push(stack, &top);
                break;
            case 2:
                pop(stack, &top);
                break;
            case 3:
                display(stack, top);
                break;
            case 4:
                peek(stack,top);
                break;
            case 5:
                exit(0);    
        }

    } while (choice <= 5);

    return 0;
}