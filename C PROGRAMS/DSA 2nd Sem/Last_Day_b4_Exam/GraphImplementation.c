#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}Node;

void addEdge(Node* arr[],int src,int dest){
    Node* newNode=(Node*)malloc(sizeof(Node));
    newNode->data=dest;
    newNode->next=arr[src];
    arr[src]=newNode;
}

void printGraph(Node* arr[],int V){
    for(int i=0;i<V;i++){
        printf("Vertex %d: ",i);
        Node* temp=arr[i];
        while(temp!=NULL){
            printf("%d",temp->data);
            temp=temp->next;
        }
    }
}

int main(){

    int V;
    int E;

    printf("Enter number of vertices: ");
    scanf("%d",&V);

    Node* arr[V];
    for(int i=0;i<V;i++){
        arr[i]=NULL;
    }

    printf("Enter number of edges: ");
    scanf("%d",&E);

    for(int i=0;i<E;i++){
        int src; int dest;
        printf("Enter source and destination: ");
        scanf("%d%d",&src,&dest);
        addEdge(arr,src,dest);
    }

    printGraph(arr,V);

    return 0;
}