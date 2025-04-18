#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list *next;
};

int main(){

    struct list *left=NULL;
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

                    count++;
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
                printf("Count is: %d",count);
                break;
            case 4:
                present=left;
                temp=present;
                present=present->next;
                left=left->next;
                free(temp);
                count--;
                break;
        }

    }while(choice<=5);

    return 0;
}