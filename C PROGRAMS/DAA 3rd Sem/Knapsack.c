#include <stdio.h>

int main() {

    int n = 3;
    float weight[] = {10, 20, 30};
    float profit[] = {60, 100, 120};
    float capacity = 50;
    
    float ratio[n];
    for(int i=0;i<n;i++){
        ratio[i] = profit[i]/weight[i];
    }
    
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(ratio[i] < ratio[j]){
                
                float t = ratio[i];
                ratio[i] = ratio[j];
                ratio[j] = t;
                
                t = weight[i];
                weight[i] = weight[j];
                weight[j] = t;
                
                t = profit[i];
                profit[i] = profit[j];
                profit[j] = t;
                
            }
        }
    }
    
    float totalProfit = 0;
    
    for(int i=0; i<n; i++){
        if(capacity >= weight[i]){
            totalProfit += profit[i];
            capacity -= weight[i];
        }else{
            totalProfit += ratio[i] * capacity;
            break;
        }
    }
    
    printf("%f", totalProfit);
    
    return 0;
}