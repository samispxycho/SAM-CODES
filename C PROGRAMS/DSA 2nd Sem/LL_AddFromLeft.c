#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list *next;
};

int main(){

    struct list *present=NULL, *left=NULL;
    int count=0;

    int choice;

    do{
        printf("\n1: Click 1 to add a new List\n2: Click 2 to display\n3: Count number of nodes\n4: Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d",&choice);

        switch(choice){
            
            case 1:
                present=(struct list *)malloc(sizeof(struct list));
                if(present!=NULL){
                    int ele;
                    printf("Enter the data: ");
                    scanf("%d",&ele);

                    present->data=ele;
                    present->next=NULL;

                    if(left==NULL){
                        left=present;
                    }else{
                        present->next=left;
                        left=present;
                    }
                }
                count+=1;
                printf("Element entered\n");
                break;
            
            case 2:
                present=left;
                while(present!=NULL){
                    printf("%d->", present->data);
                    present=present->next;
                }
                printf("NULL\n");
                break;
            
            case 3:
                printf("Number of nodes: %d\n",count);
                break;
            
            case 4:
                exit(1);
            
        }

    }while(choice<=4);

    return 0;
}