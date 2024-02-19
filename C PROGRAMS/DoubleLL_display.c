//Program to display all the elements in the list

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* left;
    struct node* right;
};
struct node* root=NULL;

void display()
{
    struct node* temp;
    temp=root;
    if(temp==NULL)
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

int main()
{
    display();
    return 0;
}