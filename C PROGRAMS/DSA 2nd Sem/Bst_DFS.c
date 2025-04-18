#include<stdio.h>

typedef struct tree{
    int data;
    struct tree *left;
    struct tree *right;
}tree;

void maxValue(tree *root){
    if(root==NULL)return;

    tree *curr=root;
    while(curr->right!=NULL){
        curr=curr->right;
    }

    printf("Max value is: %d",curr->data);
}

void minValue(tree *root){
    tree *curr=root;
    while(curr->left!=NULL){
        curr=curr->left;
    }
    printf("%d",curr->data);
}

void NodesWithCommonParent(tree* root,int *count){
    if(root==NULL)return;
    
    if(root->left!=NULL && root->right!=NULL){
        *count+=2;
    }
    NodesWithCommonParent(root->left,count);
    NodesWithCommonParent(root->right,count);
}

void leftCount(tree *root, int *count){
    if(root==NULL)return;

    tree* curr=root;
    while(curr!=NULL){
        *count++;
        curr=curr->left;
    }
    printf("%d",*count);
}

void rightCount(tree* root,int *count){
    if(root==NULL){
        return;
    }

    (*count)+=1;
    rightCount(root->right,count);
}

int main(){

    tree *root=NULL;
    int c=0;
    count(root,&c);
    
}