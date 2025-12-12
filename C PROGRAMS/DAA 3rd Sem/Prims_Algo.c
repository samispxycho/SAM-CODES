#include <stdio.h>
#define INF 99999

int main() {
    
    int n = 5;
    
    int matrix[5][5] = {
        {0, 2, INF, 6, INF},
        {2, 0, 3, 8, 5},
        {INF, 3, 0, INF, 7},
        {6, 8, INF, 0, 9},
        {INF, 5, 7, 9, 0}
    };
    
    int visited[5]={0};
    visited[0] = 1;
    
    int edges = 0;
    int cost = 0;
    
    while(edges < n-1){
        
        int min = INF;
        int x = 0;
        int y = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i] == 1){
                for(int j=0; j<n; j++){
                    if(visited[j]==0 && matrix[i][j] < min){
                        min = matrix[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
        }
        
        visited[y] = 1;
        edges+=1;
        cost+=min;
        
    }
    
    printf("%d", cost);
    return 0;
}