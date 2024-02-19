//Program to find the length of the double linked list

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* left;
    struct node* right;
};
struct node* root=NULL;

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

int main()
{
    length();
    return 0;
}