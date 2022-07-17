//Program to display nodes present in a binary search tree using three diff ways

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
    temp=(node*)malloc(sizeof(node*));
    temp->left=NULL;
    temp->right=NULL;

    return temp;
}

//Traversing using pre order(data,left,right)

void pre_order(node* root)
{
    if(root!=0)
    {
        printf("%d ",root->data);
        pre_order(root->left);
        pre_order(root->right);
    }
}

//Traversing using in order(left,data,right)

void in_order(node* root)
{
    if(root!=NULL)
    {
        in_order(root->left);
        printf("%d ",root->data);
        in_order(root->right);
    }
}

//Traversing using post order(left,right,data)

void post_order(node* root)
{
    if(root!=0)
    {
        post_order(root->left);
        post_order(root->right);
        printf("%d ",root->data);
    }
}

int main()
{
    
}