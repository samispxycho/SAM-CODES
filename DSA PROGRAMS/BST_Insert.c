//Program to insert a new node into a binary search tree

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    struct node* left;
    int data;
    struct node* right;
}node;

node* insert(node* root,int x)
{
    if(root==NULL)
    {
        node* temp;
        temp=(node*)malloc(sizeof(node));
        x=temp->data;
        temp->left=0;
        temp->right=0;

        root=temp;

        return root;
    }

    else if(root->data>x)
    {
        root->left=insert(root->left,x);
    }

    else if(root->data<x)
    {
        root->right=insert(root->right,x);
    }

    else
    {
        printf("Please enter a valid input\n");
    }

    return root;
}

int main()
{
    node* root=NULL;

    int x;
    printf("Enter data element\n");
    scanf("%d",&x);
    root=insert(root,x);
}