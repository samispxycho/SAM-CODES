#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}list;

void oddInfo(list* left,int *output){
    list *present=left;
    while(present!=NULL){
        int ele=present->data;
        int d=ele%10;
        *output=*output*d;
        present=present->next;
    }
    printf("%d",output);
}

int main(){

    int output=1;

    list *left=NULL;
    list *right=NULL;
    list *present=NULL;

    int ch;
    int count;
    do{
        printf("\nEnter 1 to add element\nEnter 2 to display elements\nEnter 3 to count\nEnter 4 to delete an element\n\nEnter choice: ");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                present=(list*)malloc(sizeof(list));
                if(present!=NULL){
                    int ele;
                    printf("Enter data to enter: ");
                    scanf("%d",&ele);
                    present->data=ele;
                    present->next=NULL;

                    if(right==NULL)left=right=present;
                    else{
                        right->next=present;
                        right=right->next;
                    }
                }
                break;
            case 2:
                present=left;
                while(present!=NULL){
                    printf("%d ",present->data);
                    present=present->next;
                }
                break;
            case 3:
                count=0;
                present=left;
                while(present!=NULL){
                    count+=1;
                    present=present->next;
                }
                break;
            case 4:
                present=left;
                int del;
                printf("Enter element to delete: ");
                scanf("%d",&del);
                while(present!=NULL){
                    if(present->next->data==del){

                    }else{
                        present=present->next;
                    }
                }
        }

    }while(ch<=3);

    return 0;
}