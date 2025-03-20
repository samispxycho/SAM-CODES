#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list *next;
};

int main(){

    struct list *left=NULL;
    struct list *right=NULL;
    struct list *present=NULL;
    struct list *temp=NULL;

    int count=0;
    int choice;
    do{
        printf("\nEnter 1 to insert\nEnter 2 to display\nEnter 3 to count\nEnter 4 to delete last\nEnter 5 to exit\n");
        printf("\nEnter your choice: ");
        scanf("%d",&choice);

        switch(choice){
            case 1:
                present=(struct list*)malloc(sizeof(struct list));
                if(present!=NULL){
                    int ele;
                    printf("Enter element to insert: ");
                    scanf("%d",&ele);

                    present->data=ele;
                    present->next=NULL;
                    count++;

                    if(left==NULL && right==NULL){
                        left=right=present;
                    }else{
                        right->next=present;
                        right=right->next;
                    }
                    break;
                }
                case 2:
                    present=left;
                    while(present!=NULL){
                        printf("%d ",present->data);
                        present=present->next;
                    }
                    break;
                case 3:
                    printf("Total count is: %d",count);
                    break;
                case 4:
                    present=left;
                    while(present->next!=right){
                        present=present->next;
                    }
                    temp=right;
                    right=present;
                    present->next=NULL;
                    free(temp);
                    count--;
                    break;
                case 5:
                    exit(0);

        }

    }while(choice<=5);


    return 0;
}