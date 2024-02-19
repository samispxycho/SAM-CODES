//Program to add a new node after a specific node

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* left;
    struct node* right;
};
struct node* root=NULL;

void add_after()
{
    struct node* temp, *p;
    int loc,len,i=1;
    printf("Enter the location after which you want to add a new node\n");
    scanf("%d",&loc);
    len=length();

    if(loc>len)
    {
        printf("Invalid location\n");
    }
    else
    {
        temp=(struct node*)malloc(sizeof(struct node));
        printf("Enter node data\n");
        scanf("%d",&temp->data);
        temp->right=NULL;
        temp->left=NULL;

        p=root;
        while(i<loc)
        {
            p=p->right;
            i++;
        }
        temp->right=p->right;
        p->right->left=temp;
        temp->left=p;
        p->right=temp;
    }
}

int main()
{
    add_after();
    return 0;
}