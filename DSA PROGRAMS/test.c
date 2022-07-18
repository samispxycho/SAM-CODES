#include<stdio.h>
#include<stdlib.h>

typedef struct tree
{
    int data;
    struct tree *right;
    struct tree *left;
}node;
//*********************************

node * insert(node* root,int x)
{
    if(root==NULL)
    {
        node *p;
        p=(node *)malloc(sizeof(node));
        p->data=x;
        p->left=0;
        p->right=0;
        root=p;
        return root;
    }
    else if(root->data>x)
        root->left=insert(root->left,x);
    else if(root->data<x)
        root->right=insert(root->right,x);
    else
        printf("\n\nPLEASE ENTER THE VALID VALUE...!!\n\n");

    return root;


}
//*********************************
void  preorder(node *root)
{
    if(root!=NULL)
    {
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}
//**********************************

void  inorder(node *root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}
//***********************************
void  postorder(node *root)
{
    if(root!=NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->data);
    }
}
//**********************************

void count(node *root,int *c)
{
    if(root!=0)
    {
        (*c)++;
        count(root->left,c);
        count(root->right,c);
    }
}
//************************************
 void l_s(node *root)
 {
     node *p=root;

     while(root->right!=0)
        root=root->right;
     printf("\n\nTHE LARGEST NODE IN THE TREE IS:%d\n\n",root->data);

    root=p;

     while(root->left!=0)
        root=root->left;
     printf("\n\nTHE SMALLEST NODE IN THE TREE IS:%d\n\n",root->data);

 }

//******************************************
 void count_leaf(node * root,int *cnt)
 {
     if(root)
     {
         if(root->left==NULL&&root->right==NULL)
            (*cnt)++;
         else
         {
             if(root->left)
             count_leaf(root->left,cnt);
             if(root->right)
             count_leaf(root->right,cnt);
         }
     }
 }
//*******************************************
void main()
{
    printf("\n\n\tBINARY SEARCH TREE\n\n");

    node *root=NULL;

    int i,x,c,cnt;
    while(1)
    {
        puts("1.INSERT");
        puts("2.PRE ORDER");
        puts("3.IN ORDER");
        puts("4.POST ORDER");
        puts("5.TOTAL NODES IN A TREE");
        puts("6.BIGGEST AND SMALLEST NODE IN THE TREE");
        puts("7.COUNT LEAF NODES");


        printf("\n\nENTER YOUR CHOICE:");
        scanf("%d",&i);
        switch(i)
        {
        case 1:
            printf("\n\nENTER THE ELEMENT:");
            scanf("%d",&x);
            root=insert(root,x);
            break;

        case 2:
            if(root==0)
            printf("\n\nTHERE IS NO NODE IN TREE..!!\n\n");
            else
            {
            printf("\n\nPRE ORDER\n\n");
            preorder(root);
            printf("\n\n");
            }
             break;

        case 3:
        if(root==0)
            printf("\n\nTHERE IS NO NODE IN TREE..!!\n\n");
        else
        {
            printf("\n\nIN ORDER\n\n");
            inorder(root);
            printf("\n\n");
        }
            break;

        case 4:
        if(root==0)
            printf("\n\nTHERE IS NO NODE IN TREE..!!\n\n");
        else
        {
            printf("\n\nPOST ORDER\n\n");
            postorder(root);
            printf("\n\n");
        }
            break;

        case 5:
             c=0;
            if(root==NULL)
                printf("\n\nNO NODE IN A TREE\n\n");
            else
            {
              count(root,&c);
              printf("\n\nTHE TOTAL NUMBER OF NODES:%d\n",c);
            }
            break;
        case 6:
             if(root==NULL)
                printf("\n\nNO NODE IN A TREE\n\n");
            else
            {
                l_s(root);
            }
            break;
        case 7:
            if(root==NULL)
                printf("\n\nNO NODE IN A TREE\n\n");
            else
            {
                cnt=0;
                count_leaf(root,&cnt);
                printf("\n\nTHE TOTAL NUMBER OF THE LEAF NODE:%d\n\n",cnt);
            }

        }
    }
}