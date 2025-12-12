// Online C compiler to run C program online
#include <stdio.h>
#define INF 99999

void floydWarshall(int dist[4][4], int n){
    for(int k=0; k<n; k++){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dist[i][k] + dist[k][j] < dist[i][j]){
                    dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
    }
}

int main() {
    
    int n = 4;
    int dist[4][4] = {
        {0,   2,   6, INF},
        {INF, 0,   3,   1},
        {INF, INF, 0,   1},
        {INF, INF, INF, 0}
    };
    
    floydWarshall(dist, n);

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(dist[i][j] == INF) printf("INF ");
            else printf("%d ", dist[i][j]);
        }
        printf("\n");
    }

    return 0;
}