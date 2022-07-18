//Program to count the number of nodes in a BST

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    struct node* left;
    int data;
    struct node* right;
}node;

void count(node* root,int *c)
{
    if(root!=NULL)
    {
        (*c)++;
        count(root->left,c);
        count(root->right,c);
    }
}

int main()
{
    node*root=NULL;

    int c=0;
    if(root==NULL)
    {
        printf("No nodes present in the binary search tree\n");
    }
    else
    {
        count(root,&c);
        printf("There are currently %d nodes present\n",c);
    }
}