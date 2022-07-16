//Program to insert a node at the start of the linked list.

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* link;
};
struct node* root=NULL;

void add_at_begin()
{
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter data element\n");
    scanf("%d",&temp->data);
    temp->link=NULL;
    
    if(root==NULL)
    {
        root=temp;
    }
    else
    {
        temp->link=root;
        root=temp;
    }
}

int main()
{
    add_at_begin();
    return 0;
}