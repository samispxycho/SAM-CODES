//Program to delete a node from a linked list

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* link;
};
struct node* root=NULL;

void delete()
{
    struct node* temp;
    int loc;
    printf("Enter the location\n");
    scanf("%d",&loc);
    if(loc>length())
    {
        printf("Invalid input\n");
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
        struct node *p, *q;
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

int main()
{
    delete();
    return 0;
}