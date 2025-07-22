#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}list;

int main(){

    list *left=NULL;
    list *present=NULL;

    int count=0;
    int ch;
    do{
        printf("\nEnter 1 to add element\nEnter 2 to display\nEnter 3 to count nodes\n\nEnter choice: ");
        scanf("%d",&ch);

        switch(ch){
            case 1:
                present=(list*)malloc(sizeof(list));
                if(present!=NULL){
                    int ele;
                    printf("Enter element to enter: ");
                    scanf("%d",&ele);
                    present->data=ele;

                    present->next=left;
                    left=present;
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
        }

    }while(ch<=3);

    return 0;
}