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

void dfs(Node* arr[], int src, int dest, int visited[], int path[], int pathIndex) {
    visited[src] = 1;
    path[pathIndex] = src;
    pathIndex++;

    if (src == dest) {
        printf("Path: ");
        for (int i = 0; i < pathIndex; i++) {
            printf("%d ", path[i]);
        }
        printf("\n");
    } else {
        Node* curr = arr[src];
        while (curr != NULL) {
            if (!visited[curr->value]) {
                dfs(arr, curr->value, dest, visited, path, pathIndex);
            }
            curr = curr->next;
        }
    }

    pathIndex--;
    visited[src] = 0;  // Backtrack
}

int main() {
    int V = 7;
    Node* arr[V];
    for (int i = 0; i < V; i++) {
        arr[i] = NULL;
    }

    // 0-based edge initialization
    addEdge(arr, 0, 1);
    addEdge(arr, 0, 3);
    addEdge(arr, 1, 0);
    addEdge(arr, 1, 2);
    addEdge(arr, 2, 1);
    addEdge(arr, 2, 3);
    addEdge(arr, 2, 4);
    addEdge(arr, 3, 0);
    addEdge(arr, 3, 2);
    addEdge(arr, 4, 2);
    addEdge(arr, 4, 5);
    addEdge(arr, 4, 6);
    addEdge(arr, 5, 4);
    addEdge(arr, 6, 4);

    printGraph(arr, V);

    int visited[V];
    for (int i = 0; i < V; i++) {
        visited[i] = 0;
    }

    int src, dest;
    printf("Enter source and destination (0 to %d): ", V - 1);
    scanf("%d %d", &src, &dest);

    int path[V];

    printf("Paths from %d to %d:\n", src, dest);
    dfs(arr, src, dest, visited, path, 0);

    return 0;
}
