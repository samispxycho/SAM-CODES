#include <stdio.h>
#define INF 99999

int minDist(int dist[], int visited[], int n) {
    int min = INF, min_index = -1;
    for (int v = 0; v < n; v++) {
        if (!visited[v] && dist[v] <= min) {
            min = dist[v];
            min_index = v;
        }
    }
    return min_index;
}

int main() {
    int n = 5;
    int graph[5][5] = {
        {0, 2, INF, 6, INF},
        {2, 0, 3, 8, 5},
        {INF, 3, 0, INF, 7},
        {6, 8, INF, 0, 9},
        {INF, 5, 7, 9, 0}
    };

    int src = 0;
    int dist[5];
    int visited[5] = {0};

    for (int i = 0; i < n; i++) dist[i] = INF;
    dist[src] = 0;

    for (int count = 0; count < n - 1; count++) {
        int u = minDist(dist, visited, n);
        if (u == -1) break;
        visited[u] = 1;

        for (int v = 0; v < n; v++) {
            if (!visited[v] && graph[u][v] != INF && dist[u] != INF
                && dist[u] + graph[u][v] < dist[v]) {
                dist[v] = dist[u] + graph[u][v];
            }
        }
    }

    printf("Vertex\tDistance from Source %d\n", src);
    for (int i = 0; i < n; i++) {
        if (dist[i] == INF) printf("%d\t\tINF\n", i);
        else printf("%d\t\t%d\n", i, dist[i]);
    }

    return 0;
}