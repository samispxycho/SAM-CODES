#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* link;
};
struct node* root=NULL;

void display()
{
    struct node* temp;
    temp=root;
    if(temp==NULL)
    {
        printf("Linked List is empty\n");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d-->",temp->data);
            temp=temp->link;
        }
    }
}

int main()
{
    display();
    return 0;
}