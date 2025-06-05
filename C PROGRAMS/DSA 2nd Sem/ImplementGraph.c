#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int value;
    struct node* next;
} Node;

void addEdge(Node* arr[], int src, int dest) {

    Node* new_node = (Node*)malloc(sizeof(Node));
    new_node->value = dest;
    new_node->next = arr[src];
    arr[src] = new_node;
}

void printGraph(Node* arr[], int V) {
    for (int i = 0; i < V; i++) {
        printf("Vertex %d: ", i);
        Node* temp = arr[i];
        while (temp != NULL) {
            printf("%d -> ", temp->value);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}

int main() {

    int V, E;
    printf("Enter the number of vertices: ");
    scanf("%d", &V);

    Node* arr[V];

    for (int i = 0; i < V; i++) {
        arr[i] = NULL;
    }

    printf("Enter the number of edges: ");
    scanf("%d", &E);

    printf("Enter the edges (source and destination vertices):\n");
    for (int i = 0; i < E; i++) {
        int src, dest;
        scanf("%d %d", &src, &dest);
        addEdge(arr, src, dest);
    }

    printGraph(arr, V);


    return 0;
}
