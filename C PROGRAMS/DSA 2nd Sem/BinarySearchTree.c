#include<stdio.h>
#include<stdlib.h>

typedef struct tree{
    struct tree *left;
    int data;
    struct tree *right;
}tree;

tree* create(int value){
    tree* curr=(tree*)malloc(sizeof(tree));
    curr->data=value;
    curr->left=curr->right=NULL;

    return curr;
}

tree* insert(tree* root,int value){
    if(root==NULL){
        return create(value);
    }
    
    if(value<root->data){
        root->left=insert(root->left,value);
    }else{
        root->right=insert(root->right,value);
    }

    return root;
}

void inorder(tree *root){
    if(root==NULL)return;
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}

void countNodes(tree *root,int *count){
    if(root==NULL){
        return;
    }
    *(count)+=1;
    countNodes(root->left,count);
    countNodes(root->right,count);
}

void countLeafNodes(tree *root,int *leafCount){
    if(root==NULL)return;
    if(root->left==NULL && root->right==NULL){
        *(leafCount)+=1;
    }
    countLeafNodes(root->left,leafCount);
    countLeafNodes(root->right,leafCount);
}

void countSingleChild(tree *root,int *singleChild){
    if(root==NULL)return;
    if((root->left==NULL && root->right!=NULL) || (root->left!=NULL && root->right==NULL)){
        *(singleChild)+=1;
    }
    countSingleChild(root->left,singleChild);
    countSingleChild(root->right,singleChild);
}

void maxValue(tree *root){
    if(root==NULL)return;
    tree *curr=root;
    while(curr->right!=NULL){
        curr=curr->right;
    }
    printf("MAX value is: %d",curr->data);
}



void minValue(tree *root){
    if(root==NULL)return;
    tree *curr=root;
    while(curr->left!=NULL){
        curr=curr->left;
    }
    printf("Minimum value: %d",curr->data);
}

void nodesWithCommonParent(tree *root,int *commonParent){
    if(root==NULL)return;
    if(root->left!=NULL && root->right!=NULL){
        *(commonParent)+=2;
    }
    nodesWithCommonParent(root->left,commonParent);
    nodesWithCommonParent(root->right,commonParent);
}

int height(tree *root){
    if(root==NULL)return 0;
    int left=height(root->left);
    int right=height(root->right);

    if(left>right)return left+1;
    else return right+1;
}

void findParent(tree *root, int ele){
    if(root==NULL)return;
    if(root->left->data==ele || root->right->data==ele){
        printf("Parent is: %d",root->data);
        return;
    }
    if(ele < root->data){
        findParent(root->left,ele);
    }else{
        findParent(root->right,ele);
    }
}

void findInorderSuccessor(tree *root,int arr[],int *index){
    if(root==NULL)return;
    findInorderSuccessor(root->left,arr,index);
    arr[(*index)++]=root->data;
    findInorderSuccessor(root->right,arr,index);
}

int main(){

    tree *root=NULL;
    int choice=0;
    int ele=0;
    int arr[100];
    int index=0;

    while(choice<=10){
        printf("Enter 1 to insert a node\nEnter 2 to display\nEnter 3 to count number of nodes\nEnter 4 to count leaf nodes\nEnter 5 to count nodes with only 1 child\nEnter 6 to find max value\nEnter 7 to find min value\nEnter 8 to find nodes with common parent\nEnter 9 to find height of tree\nEnter 10 to find parent of a node\n");
        scanf("%d",&choice);

        switch(choice){
            case 1:
                int value;
                printf("Enter value to insert: ");
                scanf("%d",&value);
                root=insert(root,value);
                break;
            case 2:
                inorder(root);
                break;
            case 3:
                int count=0;
                countNodes(root,&count);
                printf("Number of nodes: %d",count);
                break;
            case 4:
                int leafCount=0;
                countLeafNodes(root,&leafCount);
                printf("Number of leaf nodes: %d",leafCount);
                break;
            case 5:
                int singleChild=0;
                countSingleChild(root,&singleChild);
                printf("Nodes with only 1 child are: %d",singleChild);
                break;
            case 6:
                maxValue(root);
                break;
            case 7:
                minValue(root);
                break;
            case 8:
                int commonParent=0;
                nodesWithCommonParent(root,&commonParent);
                printf("Number of nodes with common parent are: %d or %d pair",commonParent,commonParent/2);
                break;
            case 9:
                int h=height(root);
                printf("Height of tree is: %d",h);
                break;
            case 10:
                printf("Enter node whom you want to find the parent of: ");
                scanf("%d",&ele);
                findParent(root,ele);
                break;
            case 11:
                findInorderSuccessor(root,arr,&index); 
                   
                for(int i = 0; i < index - 1; i++){
                    if(arr[i] == ele){
                        printf("Inorder successor of %d is: %d\n", ele, arr[i + 1]);
                        return;
                    }
                }
            
                break;

        }
    }

    return 0;
}