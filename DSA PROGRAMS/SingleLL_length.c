#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* link;
};
struct node* root=NULL;

int length()
{
    int count = 0;
    struct node* temp;
    temp=root;
    while(temp != NULL)
    {
        count++;
        temp=temp->link;
    }
    return count;
}

int main()
{
    length();
    return 0;
}