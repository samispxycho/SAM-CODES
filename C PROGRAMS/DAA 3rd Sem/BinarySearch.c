#include<stdio.h>

int binarySearch(int arr[],int n,int key){
    int low = 0;
    int high = n-1;

    while(low<=high){
        
        int mid = (low+high)/2;
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }
    return -1;
}

int main(){

    int arr[] = {5,10,15,20,25,30,35,40,45,50};
    int n = sizeof(arr)/sizeof(arr[0]);

    int key;
    printf("Enter element to search: ");
    scanf("%d",&key);

    int result = binarySearch(arr,n,key);

    if(result!=-1){
        printf("Element found at index %d",result);
    }else{
        printf("Element not found");
    }

    return 0;
}