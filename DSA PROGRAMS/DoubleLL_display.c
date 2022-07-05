#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*left;
    struct node*right;
};
struct node*root=NULL;

void display()
{
    struct node*temp=root;
    if(temp==NULL)
    {
        printf("List is empty");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d-->",temp->data);
            temp=temp->right;
        }
    }
}