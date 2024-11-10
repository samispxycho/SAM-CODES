#include<stdio.h>

void swap(int* arr, int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

int main(){

    int arr[5]={5,4,3,2,1};

    int size = sizeof(arr)/sizeof(arr[0]);

    int i,j;
    for(i=0;i<size-1;i++){
        for(j=0;j<size-i-1;j++){
            if(arr[j] > arr[j+1]){
                swap(arr,j,j+1);
            }
        }
    }

    int k;
    for(k=0;k<size;k++){
        printf("%d\n",arr[k]);
    }
    
    return 0;
}