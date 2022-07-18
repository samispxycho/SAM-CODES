//Program to find the maximum and minimum node in a binary search tree

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    struct node* left;
    int data;
    struct node* right;
}node;

node* MaxMin(node* root)
{
    node* temp;
    temp=root;

    while(root->right!=NULL)
    {
        root=root->right;
    }
    printf("The largest node in the tree is %d\n",root->data);

    root=temp;
    while(root->left!=NULL)
    {
        root=root->left;
    }
    printf("The smallest node in the tree is %d \n",root->data);
}