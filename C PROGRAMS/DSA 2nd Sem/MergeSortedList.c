#include<stdio.h>
#include<stdlib.h>

typedef struct node {
    int data;
    struct node* next;
}Node;

Node* createNode(int data){
    Node *temp = (Node*)malloc(sizeof(Node));
    temp->data = data;
    temp->next = NULL;
    return temp;
}

void insertSorted(Node** head,int val){

    Node *newNode = createNode(val);

    if(*head == NULL || (*head)->data == val){
        newNode->next = *head;
        *head = newNode;
        return;
    }

    Node* current = *head;
    while(current->next != NULL && current->next->data < val){
        current = current->next;
     
    }
       newNode->next = current->next;
        current->next = newNode;
}

Node* mergeList(Node* L1, Node* L2){
    if(!L1) return L2;
    if(!L2) return L1;

    if(L1->data < L2->data){
        L1->next = mergeList(L1->next,L2);
        return L1;
    }
    else{
        L2->next = mergeList(L1 , L2->next);
        return L2;
    }
}

void printList(Node* list){
    while(list !=NULL){
        printf(" %d -> ",list->data);
        list = list->next;
    }
    printf(" NULL \n");
}

int main(){
    Node *List1 = NULL, *List2 = NULL, *List3 = NULL;
    int ch,val;

    do{
        printf("\n1. Enter element in Linked List 1\n2. Display Linked List 1\n3. Enter element in Linked List 2\n4. Display Linked List 2\n5.Merge Linked List 1 and 2\n6. Display Linked List 3\n7. Exit\nEnter your choice = ");

        scanf("%d",&ch);

        switch(ch){
            case 1:
                printf("Enter element to insert = ");
                scanf("%d",&val);

                insertSorted(&List1,val);
                break;

            case 2:
                printf("\nList 1 = ");
                printList(List1);
                break;
            
            case 3:
                printf("Enter element to insert = ");
                scanf("%d",&val);

                insertSorted(&List2,val);
                break;

            case 4:
                printf("\nList 2 = ");
                printList(List2);
                break;

            case 5:
                List3 = mergeList(List1,List2);
                printf("List 1 and List 2 merged successfully\n");
                break;

            case 6:
            printf("merged List = ");
            printList(List3);
            break;

            case 7:
                break;
        }


    }while(ch!=7);
}