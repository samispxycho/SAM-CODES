//Program to count the leaf nodes present in a binary search tree.

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    struct node* left;
    int data;
    struct node* right;
}node;

void leafCount(node* root,int *cnt)
{
    if(root)
    {
        if(root->left==NULL && root->right==NULL)
        {
            (*cnt)++;
        }
        else
        {
            if(root->left)
            {
                leafCount(root->left,cnt);
            }
            if(root->right)
            {
                leafCount(root->right,cnt);
            }
        }
    }
}

int main()
{
    node* root=NULL;
    
    if(root==NULL)
    {
        printf("No nodes present currently\n");
    }
    else
    {
        int cnt=0;
        leafCount(root,&cnt);
        printf("There are currently %d nodes present\n",cnt);
    }

    return 0;
}