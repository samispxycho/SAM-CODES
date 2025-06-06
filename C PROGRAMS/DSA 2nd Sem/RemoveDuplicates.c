#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}Node;

void removeDuplicate(Node *head){
    Node *pos1=head;
    Node *pos2=head;

    while(pos1 && pos1->next){
        pos2=pos1;
        while(pos2->next){
            if(pos1->data==pos2->next->data){
                Node *temp=pos2->next;
                pos2->next=pos2->next->next;
                free(temp);
            }else{
                pos2=pos2->next;
            }
        }
        pos1=pos1->next;
    }

}

int main(){

    Node *present=NULL;
    Node *left=NULL;

    int ch;
    do{
        printf("Enter 1 to insert into list\nEnter 2 to remove duplicates\nEnter 3 to display\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:
                present=(Node*)malloc(sizeof(Node));
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
                removeDuplicate(left);
                break;
            case 3:
                present=left;
                while(present!=NULL){
                    printf("%d->",present->data);
                    present=present->next;
                }
                break;
        }
    }while(ch<=3);

    return 0;
}
