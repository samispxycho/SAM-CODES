#include <stdio.h>

void naiveSearch(char str[], char pattern[]){
    int n=0;
    int m=0;
    
    while(str[n]!='\0') n++;
    while(pattern[m]!='\0') m++;
    
    for(int i=0; i<=n-m; i++){
        int j;
        for(j=0; j<m; j++){
            if(str[i+j]!=pattern[j]){
                break;
            }
        }
        if(j==m){
            printf("Found at %d",i);
        }
    }
    
}

int main() {
    
    char str[] = "abcbcabcabababd";
    char pattern[] = "ababd";
    
    naiveSearch(str, pattern);
    

    return 0;
}