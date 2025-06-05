#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}Node;

Node *createNode(int val){
    Node *temp = (Node*)malloc(sizeof(Node));
    temp->data = val;
    temp->next = NULL;
    return temp;
}

void insertSorted(Node **head, int val){
    Node *newNode = createNode(val);

    if (*head == NULL || (*head)->data > val) {
        newNode->next = *head;
        *head = newNode;
        return;
    }

    Node *curr = *head;
    while (curr->next != NULL && curr->next->data < val) {
        curr = curr->next;
    }

    newNode->next = curr->next;
    curr->next = newNode;
}

Node *mergeList(Node *list1, Node *list2){
    if (!list1) return list2;
    if (!list2) return list1;

    if (list1->data < list2->data) {
        list1->next = mergeList(list1->next, list2);
        return list1;
    } else {
        list2->next = mergeList(list1, list2->next);
        return list2;
    }
}

void printList(Node *head){
    while (head != NULL) {
        printf("%d -> ", head->data);
        head = head->next;
    }
    printf("NULL\n");
}

int main(){
    Node *list1 = NULL;
    Node *list2 = NULL;
    Node *list3 = NULL;

    int ch, val;

    do {
        printf("\n1. Insert into List 1\n2. Insert into List 2\n3. Merge Lists\n4. Display Lists\n5. Exit\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("Enter value to insert into List 1: ");
                scanf("%d", &val);
                insertSorted(&list1, val);
                break;

            case 2:
                printf("Enter value to insert into List 2: ");
                scanf("%d", &val);
                insertSorted(&list2, val);
                break;

            case 3:
                list3 = mergeList(list1, list2);
                printf("Lists merged into List 3.\n");
                break;

            case 4:
                printf("List 1: ");
                printList(list1);
                printf("List 2: ");
                printList(list2);
                printf("Merged List 3: ");
                printList(list3);
                break;
        }
    } while (ch != 5);

    return 0;
}
