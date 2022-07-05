#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*left;
    struct node*right;
};
struct node*root=NULL;

int main()
{
    struct node*temp;
    temp=root;
    int count=0;
    while(temp!=NULL)
    {
        count++;
        temp=temp->right;
    }
    return 0;
}