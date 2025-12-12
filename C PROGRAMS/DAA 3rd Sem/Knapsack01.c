#include <stdio.h>

int maximum(int include, int exclude){
    if(include > exclude){
        return include;
    }
    return exclude;
}

int knapsack(int weight[], int profit[], int capacity, int n){
    
    int dp[n+1][capacity+1];
    
    for(int i=0; i<=n; i++){
        for(int j=0; j<=capacity; j++){
            
            if(i==0 || j==0){
                dp[i][j] = 0;
            }else if(weight[i-1] < j){
                
                int include = profit[i-1] + dp[i-1][j-weight[i-1]]; 
                int exclude = dp[i-1][j];
                
                dp[i][j] = maximum(include, exclude);
                
            }else{
                dp[i][j] = dp[i-1][j];
            }
            
        }
    }
    
    return dp[n][capacity];
}

int main() {

    int n = 3;
    int weight[] = {10, 20, 30};
    int profit[] = {60, 100, 120};
    int capacity = 50;
    
    int totalProfit = knapsack(weight, profit, capacity, n);
    printf("%d", totalProfit);
    
    return 0;
}