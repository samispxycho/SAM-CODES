#include<stdio.h>

int partition(int arr[], int low, int high){
    int pivot = arr[low];
    int i = low+1;
    int j = high;
    
    while(1){
        while(i<=high && arr[i]<=pivot){
            i++;
        }
        while(j>=low && arr[j]>pivot){
            j--;
        }
        if(i>=j){
            break;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    
    return j;
}

void quickSort(int arr[], int low, int high){
    if(low < high){
        int p = partition(arr, low, high);
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
    }
}

int main() {
    int arr[] = {30, 10, 50, 20, 40};
    int n = 5;

    quickSort(arr, 0, n - 1);

    printf("Sorted array: ");
    for(int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}