#include<stdio.h>

void merge(int arr[], int low, int mid, int high){
    int temp[100];
    int i=low;
    int j = mid+1;
    
    int index=low;
    
    while(i<=mid && j<=high){
        if(arr[i] < arr[j]){
            temp[index++] = arr[i++];
        }else{
            temp[index++] = arr[j++];
        }
    }
    
    while(i<=mid){
        temp[index++] = arr[i++];
    }
    
    while(j<=high){
        temp[index++] = arr[j++];
    }
    
    for(int x=low;x<=high;x++){
        arr[x] = temp[x];
    }
    
}

void mergeSort(int arr[], int low, int high){
    if(low < high){
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        
        merge(arr, low, mid, high);
    }
}

int main() {
    int arr[] = {30, 10, 50, 20, 40};
    int n = 5;

    mergeSort(arr, 0, n - 1);

    printf("Sorted array: ");
    for(int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}