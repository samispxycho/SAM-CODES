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
    curr->left=NULL;
    curr->right=NULL;
    return curr;
}

tree* insert(tree* root,int value){
    if(root==NULL){
        return create(value);
    }

    if(value<root->data){
        root->left = insert(root->left,value);
    }else{
        root->right = insert(root->right,value);
    }
    return root;
}

void preorderT(tree *root){
    if(root==NULL){
        return;
    }
    printf("%d ",root->data);
    preorderT(root->left);
    preorderT(root->right);
}

void inorderT(tree* root){
    if(root==NULL)return;

    inorderT(root->left);
    printf("%d ",root->data);
    inorderT(root->right);
}

void postorderT(tree* root){
    if(root==NULL){
        return;
    }
    postorderT(root->left);
    postorderT(root->right);
    printf("%d ",root->data);
}

void countNodes(tree* root,int *countN){
    if(root==NULL)return;

    *countN+=1;
    countNodes(root->left,countN);
    countNodes(root->right,countN);
}

void countLeafNodes(tree* root,int *countLeaf){
    if(root==NULL)return;

    if(root->left==NULL && root->right==NULL){
        *countLeaf +=1;
    }
    countLeafNodes(root->left,countLeaf);
    countLeafNodes(root->right,countLeaf);
}

void countOneChild(tree* root,int *countOne){
    if(root==NULL)return;

    if((root->left==NULL && root->right!=NULL) || (root->left!=NULL && root->right==NULL)){
        *countOne+=1;
    }
    countOneChild(root->left,countOne);
    countOneChild(root->right,countOne);
}

void findMax(tree* root){
    if(root==NULL)return;   
    tree* curr=root;
    while(curr->right!=NULL){
        curr=curr->right;
    }
    printf("Max value is: %d",curr->data);
}

void findMin(tree* root){
    if(root==NULL){
        return;
    }
    tree* curr=root;
    while(curr->left!=NULL){
        curr=curr->left;
    }
    printf("Min value is: %d",curr->data);
}

void commonParent(tree* root,int *commonP){
    if(root==NULL)return;
    if(root->left!=NULL && root->right!=NULL){
        *commonP +=2;
    }
    commonParent(root->left,commonP);
    commonParent(root->right,commonP);
}

int heightTree(tree* root){
    if(root==NULL){
        return 0;
    }
    int left=heightTree(root->left);
    int right=heightTree(root->right);

    if(left>right)return left+1;
    else return right+1;
}

void findParent(tree* root,int findP){
    if(root==NULL)return;

    if((root->left && root->left->data==findP) || (root->right && root->right->data==findP)){
        printf("Parent node is: %d",root->data);
        return;
    }
    if(root->data < findP){
        findParent(root->right,findP);
    }else{
        findParent(root->left,findP);
    }
}

void InorderSucc(tree *root,int arr1[],int *index1){
    if(root==NULL)return;

    InorderSucc(root->left,arr1,index1);
    arr1[*index1]=root->data;
    *index1+=1;
    InorderSucc(root->right,arr1,index1);
}

void InorderPred(tree* root,int arr2[],int *index2){
    if(root==NULL)return;

    InorderPred(root->left,arr2,index2);
    arr2[*index2]=root->data;
    *index2+=1;
    InorderPred(root->right,arr2,index2);
}

int main(){

    tree *root=NULL;

    int ch;
    int ele;
    int countN;
    int countLeaf;
    int countOne;
    int commonP;
    int height;
    int findP;
    int eleIs;
    int arr1[10];
    int index1=0;
    int eleIp;
    int arr2[10];
    int index2=0;

    do{

        printf("\nEnter 1 to insert a node in the tree\nEnter 2 for preorder traversal\nEnter 3 for inorder traversal\nEnter 4 for postorder traversal\nEnter 5 to count total nodes\nEnter 6 to count total leaf nodes\nEnter 7 to count nodes with only 1 child\nEnter 8 to find the max value\nEnter 9 to find the min value\nEnter 10 to find count nodes with common parent\nEnter 11 to calculate the height of the tree\nEnter 12 to find the parent of a node\nEnter 13 to find the inorder successor of an element\nEnter 14 to find the inorder predecessor of an element\n\nEnter your choice: ");

        scanf("%d",&ch);

        switch(ch){
            case 1:
                printf("\nEnter element to add in the tree: ");
                scanf("%d",&ele);
                root=insert(root,ele);
                break;
            case 2:
                preorderT(root);
                break;
            case 3:
                inorderT(root);
                break;
            case 4:
                postorderT(root);
                break;
            case 5:
                countN = 0;
                countNodes(root,&countN);
                printf("Number of nodes: %d",countN);
                break;
            case 6:
                countLeaf=0;
                countLeafNodes(root,&countLeaf);
                printf("Number of leaf nodes is: %d",countLeaf);
                break;
            case 7:
                countOne=0;
                countOneChild(root,&countOne);
                printf("Number of nodes with only 1 children: %d",countOne);
                break;
            case 8:
                findMax(root);
                break;
            case 9:
                findMin(root);
                break;
            case 10:
                commonP=0;
                commonParent(root,&commonP);
                break;
            case 11:
                height=heightTree(root);
                printf("Height of the tree is: %d",height);
                break;
            case 12:
                printf("Enter element you want to find the parent of: ");
                scanf("%d",&findP);
                findParent(root,findP);
                break;
            case 13:
                index1=0;
                printf("Enter element you want to find inorder successor of: ");
                scanf("%d",&eleIs);
                InorderSucc(root,arr1,&index1);
                for(int i=0;i<index1;i++){
                    if(arr1[i]==eleIs){
                        if(i==index1-1){
                            printf("No inorder successor");
                            break;
                        }else{
                            printf("Inorder successor is: %d",arr1[i+1]);
                        }
                    }
                }
                break;
            case 14:
                index2=0;
                printf("Enter element you want to find inorder predeccesor of: ");
                scanf("%d",&eleIp);
                InorderPred(root,arr2,&index2);
                for(int i=0;i<index2;i++){
                    if(arr2[i]==eleIp){
                        if(i==0){
                            printf("No inorder predecessor");
                            break;
                        }else{
                            printf("Inorder Predecessor is: %d",arr2[i-1]);
                        }
                    }
                }
                break;
        }

    }while(ch<=14);

    return 0;
}