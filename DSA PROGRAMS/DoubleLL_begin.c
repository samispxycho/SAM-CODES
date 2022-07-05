#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*left;
    struct node*right;
};
struct node*root=NULL;

void add_at_begin()
{
    struct node*temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter node data");
    scanf("%d",&temp->data);
    temp->left=NULL;
    temp->right=NULL;

    if(root==NULL)
    {
        root=temp;
    }
    else
    {
        temp->right=root;
        root->left=temp;
        root=temp;
    }

}