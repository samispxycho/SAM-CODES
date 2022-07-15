//Program to add a node at the end of a linked list

#include<stdio.h>
#include<stdlib.h>

//declaring function prototype
void append();

struct node                     //common structure of a single linked list//
{
    int data;
    struct node* link;
};
struct node* root=NULL;

void append()
{
    //creating a node
    struct node*temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data elements\n");
    scanf("%d",&temp->data);
    temp->link=NULL;

    if(root==NULL)
    {
        root=temp;
    }
    else
    {
        struct node*p;
        p=root;
        while(p->link!=NULL)
        {
            p=p->link;
        }
        p->link=temp;
    }
}

int main()
{
    append();
    return 0;
}