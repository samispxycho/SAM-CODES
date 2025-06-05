#include<stdio.h>
#include<stdlib.h>

typedef struct tree{
    struct tree *left;
    int data;
    struct tree *right;
}tree;

tree *create(int val){
    tree *present=NULL;
    present=(tree*)malloc(sizeof(tree));
    present->data=val;
    present->left=NULL;
    present->right=NULL;
    return present;
}

tree *insert(tree* root,int val){
    if(root==NULL){
        return create(val);
    }

    if(val < root->data){
        root->left=insert(root->left,val);
    }else{
        root->right=insert(root->right,val);
    }

    return root;
}

void dfs(tree* root){
    if(root==NULL){
        return;
    }

    dfs(root->left);
    printf("%d ",root->data);
    dfs(root->right);
}

void count(tree* root, int *c){
    if(root==NULL)return;

    *c+=1;
    count(root->left,c);
    count(root->right,c);
}

void leaf_count(tree *root,int *leaf_c){
    if(root==NULL){
        return;
    }
    if(root->left==NULL && root->right==NULL){
        *(leaf_c)+=1;
    }
    leaf_count(root->left,leaf_c);
    leaf_count(root->right,leaf_c);

}

void onlyOneChild(tree *root,int *one_child){
    if(root==NULL)return;

    if((root->left==NULL && root->right!=NULL) || (root->left!=NULL && root->right==NULL)){
        *(one_child)+=1;
    }
    onlyOneChild(root->left,one_child);
    onlyOneChild(root->right,one_child);
}

void maxValue(tree *root){
    if(root==NULL)return;

    tree *curr=root;
    while(curr->right!=NULL){
        curr=curr->right;
    }
    printf("Max value is: %d",curr->data);
}

void minValue(tree *root){
    if(root==NULL)return;

    tree *curr=root;
    while(curr->left!=NULL){
        curr=curr->left;
    }
    printf("Minimum value: %d",curr->data);
}

void commonParent(tree *root,int *commonP_count){
    if(root==NULL)return;

    if(root->left!=NULL && root->right!=NULL){
        *(commonP_count)+=2;
    }
    commonParent(root->left,commonP_count);
    commonParent(root->right,commonP_count);
}

int height(tree *root){
    if(root==NULL)return 0;
    int left=height(root->left);
    int right=height(root->right);

    if(left>right)return left+1;
    else return right+1;
}

void findParent(tree *root,int ele){
    if(root==NULL)return;
    if(root->left->data==ele || root->right->data==ele){
        printf("Parent of element %d is %d",ele,root->data);
    }
    if(root->data < ele){
        findParent(root->right,ele);
    }else{
        findParent(root->left,ele);
    }
}

void findInorderS(tree *root,int arr[],int ele, int *index){
    if(root==NULL)return;

    findInorderS(root->left,arr,ele,index);
    arr[*(index)]=root->data;
    *(index)+=1;
    findInorderS(root->right,arr,ele,index);
}

int main(){

    tree *root = NULL;
    int choice=0;

    int arr[100];
    int index=0;

    do{
        printf("Enter 1 to insert a node\nEnter 2 to display\nEnter 3 to count the nodes\nEnter 4 to count leaf nodes\nEnter 5 to count nodes with one 1 child\nEnter 6 to display the max value\nEnter 7 to display the min value\nEnter 8 to count nodes with common parent\nEnter 9 to find the height of the tree\nEnter 10 to find the parent of an element\nEnter 11 to find inorder successor of an element\n");
        scanf("%d",&choice);

        switch(choice){
            case 1:
                int val;
                printf("Enter value you want to insert\n");
                scanf("%d",&val);
                root=insert(root,val);
                break;
            case 2:
                dfs(root);
                break;
            case 3:
                int c=0;
                count(root,&c);
                printf("Number of nodes are: %d",c);
                break;
            case 4:
                int leaf_c=0;
                leaf_count(root,&leaf_c);
                printf("Count of leaf nodes: %d",leaf_c);
                break;
            case 5:
                int one_child=0;
                onlyOneChild(root,&one_child);
                printf("Count of nodes with only one child: %d",one_child);
                break;
            case 6:
                maxValue(root);
                break;
            case 7:
                minValue(root);
                break;
            case 8:
                int commonP_count=0;
                commonParent(root,&commonP_count);
                printf("Nodes with common parent: %d or %d pair",commonP_count,commonP_count/2);
                break;
            case 9:
                int h=0;
                h=height(root);
                printf("Height of the tree is: %d",h);
                break;
            case 10:
                int ele;
                printf("Enter element to find the parent of: ");
                scanf("%d",&ele);
                findParent(root,ele);
                break;
            case 11:
                int ele;
                printf("Enter element to find the inorder successor of: ");
                scanf("%d",&ele);
                index=0;
                findInorderS(root,arr,&index);
                for(int i=0;i<index-1;i++){
                    if(arr[i]==ele){
                        printf("%d",arr[i + 1]);
                        break;
                    }
                }
                break;
        }

    }while(choice<=11);

    return 0;
}
