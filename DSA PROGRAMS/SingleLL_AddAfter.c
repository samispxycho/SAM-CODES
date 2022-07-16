//Program to add a node after a particular location

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* link;
};
struct node* root=NULL;

void add_after()
{
    struct node* temp, *p;
    int loc,len,i=1;
    printf("Enter the location after which you want to add\n");
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

int main()
{
    add_after();
    return 0;
}