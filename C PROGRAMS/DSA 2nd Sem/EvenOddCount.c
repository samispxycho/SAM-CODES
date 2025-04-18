#define MAX 5
#include<stdio.h>

int main(){

    int arr[MAX]={1,2,3,4,5};
    int even=0;int odd=0;

    for(int i=0;i<MAX;i++){
        if(arr[i]%2==0){
            even++;
        }else{
            odd++;
        }
    }

    printf("Even Count: %d",even);
    printf("Even Count: %d",odd);

    
    return 0;
}