//Program to insert a new node into a binary search tree

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    struct node* left;
    int data;
    struct node* right;
}node;

node* memory()
{
    node* temp;
    temp=(node*)malloc(sizeof(node));
    temp->left=NULL;
    temp->left=NULL;

    return temp;
}

node* insert(node* root,int num)
{
    node* temp;

    if(root==NULL)
    {
        temp=memory();
        num=temp->data;
        root=temp;

        return root;
    }
    else if(root->data>num)
    {
        root->left=insert(root->left,num);
    }
    else if(root->data<num)
    {
        root->right=insert(root->right,num);
    }
    else
    {
        printf("Invalid input\n");
    }

    return root;
}

int main()
{
    int x;
    node* root=NULL;

    printf("Enter node data\n");
    scanf("%d",&x);

    root=insert(root,x);

    return 0;
}