//SINGLE LINKED LIST OPERATIONS//

#include<stdio.h>
#include<stdlib.h>

struct node                 //Creating basic structure of a node//
{
    int data;
    struct node*link;
};
struct node*root=NULL;      //This will store the base address//

//Function to display the elements of a linked list//
//display function starts//
void display()
{
    struct node*temp;
    temp=root;
    if(root==NULL)
    {
        printf("Linked list is empty, nothing to print.\n");
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
//display function ends//

//Function to calculate the length of the linked list//
//length function starts//
int length()
{
    int count=0;
    struct node*temp;
    temp=root;
    while(temp!=NULL)
    {
        count++;
        temp=temp->link;
    }
    return count;
}
//length function ends//

//Function to add nodes at the end of the linked list//
//append function begins//
void append()
{
    struct node*temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Please enter the node data.\n");
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
//append function ends//

//Function to add at the beginning of a linked list//
//add_at_begin function starts//
void add_at_begin()
{
    struct node*temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Please enter the node data\n");
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
//add_at_begin function ends//

//Function to add node in the middle of a linked list//
//add_after function begins//
void add_after()
{
    struct node*temp,*p;
    int loc,len,i=1;
    printf("Enter the location after which you want to add a new node.\n");
    scanf("%d",&loc);
    len=length();
    if(loc>len)
    {
        printf("Invalid location entered.\n");
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
        printf("Please enter the new node data");
        scanf("%d",&temp->data);
        temp->link=NULL;
        temp->link=p->link;
        p->link=temp;
    }
}
//add_after function ends//

//Function to delete a node from the linked list//
//delete function starts//
void delete()
{
    struct node*temp;
    int loc;
    printf("Enter the location at which you want to delete the node /n");
    scanf("%d",&loc);
    if(loc>length())
    {
        printf("Please enter a valid location \n");
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
        struct node*p=root,*q;
        int i=1;
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
//delete function ends//

//Main function begins//
void main()
{
    int ch;
    while(1)
    {
        printf("SINGLE LINKED LIST OPERATIONS \n \n");
        printf("Enter 1 to append a node.\n");
        printf("Enter 2 to add a node at the beginning.\n");
        printf("Enter 3 to add a node after a provided node.\n");
        printf("Enter 4 to display all the nodes.\n");
        printf("Enter 5 to calculate the length of the nodes.\n");
        printf("Enter 6 to delete a particular node.\n");
        printf("Enter 7 to exit.\n");

        printf("Enter your choice \n");
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
            case 6:
            {
                delete();
                break;
            }
            case 7:
            {
                exit(1);
            }
            default:
            {
                printf("Invalid input\n");
            }
        }

    }
}
//Main function ends//
//PROGRAM ENDS//