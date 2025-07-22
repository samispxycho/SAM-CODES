#include<stdio.h>

void swap(int arr[],int a, int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}

int partition(int arr[],int low,int high){
    int pivot=arr[low];
    int i=low+1;
    int j=high;

    while(i<=j){
        while(i<=high && arr[i]<=pivot)i++;
        while(j>=low && arr[j]>pivot)j--;

        if(i<j){
            swap(arr,i,j);
        }
    }

    swap(arr,low,j);
    return j;
}

void quickSort(int arr[],int low,int high){
    if(low<high){
        int pi=partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
}

int main(){

    int arr[]={5,4,3,2,1};
    int n=sizeof(arr)/sizeof(arr[0]);

    quickSort(arr,0,n);

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    return 0;
}