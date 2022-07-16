//Program to implement single linked list operations

#include<stdio.h>
#include<stdlib.h>

//Declaring function prototypes
void append();
void add_at_begin();
void add_after();
void delete();
void display();
int length();

struct node
{
    int data;
    struct node* link;
};
struct node* root=NULL;

int main()
{
    int ch;
    while(1)
    {
        printf("Enter 1 to append a node\n");
        printf("Enter 2 to add a node at the beginning\n");
        printf("Enter 3 to add a node after a particular node\n");
        printf("Enter 4 to delete a node\n");
        printf("Enter 5 to display all the nodes present\n");
        printf("Enter 6 to find the length of the node\n");

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
                delete();
                break;
            }
            case 5:
            {
                display();
                break;
            }
            case 6:
            {
                length();
            }
        }
    }
    return 0;
}


//Function definitions

void append()
{
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter node data\n");
    scanf("%d",&temp->data);
    temp->link=NULL;

    if(root==NULL)
    {
        root=temp;
    }
    else
    {
        struct node* p;
        p=root;
        while(p->link!=NULL)
        {
            p=p->link;
        }
        p->link=temp;
    }
}

void add_at_begin()
{
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter node data\n");
    scanf("%d",&temp->data); 
    temp->link=NULL;

    if(root==NULL)
    {
        root=temp;
    }
    else
    {
        temp->link=root;
        root=temp;
    }
}

void add_after()
{
    struct node* temp, *p;
    int loc,len,i=1;
    printf("Enter the location after which you want to add a node\n");
    scanf("%d",&loc);
    len=length();
    if(loc>len)
    {
        printf("Invalid location entered\n");
    }
    else
    {
        p=root;
        while(i<loc)
        {
            p=p->link;
            i++;
        }
        temp=(struct node*)malloc(sizeof(struct node));
        printf("Enter node data\n");
        scanf("%d",&temp->data);
        temp->link=NULL;

        temp->link=p->link;
        p->link=temp;
    }
}

void delete()
{
    struct node* temp;
    int loc,len;
    printf("Enter the location at which you want to delete\n");
    scanf("%d",&loc);
    len=length();
    if(loc>len)
    {
        printf("Invalid location entered\n");
    }
    else if(loc==1)
    {
        temp=root;
        root=temp->link;
        temp->link=NULL;
        free(temp);
    }
    else
    {
        int i=1;
        struct node* p, *q;
        p=root;
        while(i<loc-1)
        {
            p=p->link;
            i++;
        }
        q=p->link;
        p->link=q->link;
        q->link=NULL;
        free(q);
    }
}

void display()
{
    struct node* temp;
    temp=root;
    if(temp==NULL)
    {
        printf("Nothing to display, linked list empty\n");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d-->",temp->data);
            temp=temp->link;
        }
        printf("\n");
    }
}

int length()
{
    struct node* temp;
    int count =0;
    temp=root;
    while(temp!=NULL)
    {
        count++;
        temp=temp->link;
    }
    printf("Currently there are %d nodes\n",count);
    return count;
}