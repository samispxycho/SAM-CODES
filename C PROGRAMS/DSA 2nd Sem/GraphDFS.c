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

void dfs(int src, int V, int visited[], Node* arr[]) {
    if (visited[src] == 1) {
        return;
    }

    visited[src] = 1;
    printf("%d ", src);

    Node* curr = arr[src];
    while (curr != NULL) {
        dfs(curr->value, V, visited, arr);
        curr = curr->next;
    }
}

int main() {
    int V = 7;

    Node* arr[V];
    for (int i = 0; i < V; i++) {
        arr[i] = NULL;
    }

    addEdge(arr, 0, 3);  // 1 -> 4
    addEdge(arr, 3, 2);  // 4 -> 3
    addEdge(arr, 2, 1);  // 3 -> 2
    addEdge(arr, 4, 2);  // 5 -> 3
    addEdge(arr, 4, 6);  // 5 -> 7
    addEdge(arr, 5, 4);  // 6 -> 5

    printGraph(arr, V);

    int visited[V];
    for (int i = 0; i < V; i++) {
        visited[i] = 0;
    }

    int src;
    printf("\n\nEnter the src (0 to %d): ", V - 1);
    scanf("%d", &src);

    printf("\n\nAll the nodes connected to %d:\n\n", src);
    dfs(src, V, visited, arr);

    return 0;
}
