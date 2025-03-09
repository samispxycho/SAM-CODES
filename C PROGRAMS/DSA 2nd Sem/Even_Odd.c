#include <stdio.h>
#include <stdlib.h>

struct list
{
    int data;
    struct list *next;
};

int main()
{

    struct list *left = NULL, *right = NULL, *present = NULL;
    int even=0;int odd=0;

    int choice;

    do{
        printf("\n1: Click 1 to add a new List\n2: Click 2 to display\n3: Even and Odd nodes\n4: Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {

            case 1:
                present = (struct list *)malloc(sizeof(struct list));
                if (present != NULL){
                    int ele;
                    printf("Enter the data: ");
                    scanf("%d", &ele);

                    if(ele%2==0)even++;
                    else odd++;

                    present->data = ele;
                    present->next = NULL;

                    if (left == NULL && right == NULL){
                        left = right = present;
                    }else{
                        right->next = present;
                        right = present;
                    }
                }
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
                printf("Even number of nodes: %d\n",even);
                printf("Odd number of nodes: %d\n",odd);
                break;
            
            case 4:
                exit(1);

        }
    }while(choice<=4);

    return 0;
}