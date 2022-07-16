//Program to implement double linked list operations

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* right;
    struct node* left;
};
struct node* root=NULL;

//Function Prototypes
void append();
void add_at_begin();
void add_after();
void display();
int length();

int main()
{
    int ch;
    while(1)
    {
        printf("Enter 1 to append a node\n");
        printf("Enter 2 to add a node at the beginning of the list\n");
        printf("Enter 3 to add a node after a specified node\n");
        printf("Enter 4 to display all the nodes\n");
        printf("Enter 5 to find out the length of the list\n");

        printf("Enter your choice\n");
        scanf("%d",&ch);

        switch(ch)
        {
            case 1:
            {
                append();
                break;
            }
            case 2:
            {
                add_at_begin();
                break;
            }
            case 3:
            {
                add_after();
                break;
            }
            case 4:
            {
                display();
                break;
            }
            case 5:
            {
                length();
                break;
            }
        }
    }
    return 0;
}

void append()
{
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter node data\n");
    scanf("%d",&temp->data);
    temp->right=NULL;
    temp->left=NULL;

    if(root==NULL)
    {
        root=temp;
    }
    else
    {
        struct node* p;
        p=root;
        while(p->right!=NULL)
        {
            p=p->right;
        }
        p->right=temp;
        temp->left=p;
    }
}

void add_at_begin()
{
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter node data\n");
    scanf("%d",&temp->data);
    temp->right=NULL;
    temp->left=NULL;

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

void display()
{
    struct node* temp;
    temp=root;
    if(root==NULL)
    {
        printf("List is currently empty\n");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d-->",temp->data);
            temp=temp->right;
        }
        printf("\n");
    }
}

int length()
{
    struct node* temp;
    temp=root;
    int count=0;

    while(temp!=NULL)
    {
        count++;
        temp=temp->right;
    }
    printf("There are currently %d nodes in the list\n",count);
    return count;
}