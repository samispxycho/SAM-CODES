#include<stdio.h>
int main(){

    int arr1[5]={3,5,7,9,11};
    int arr2[5]={2,4,6,8,10};

    int size = sizeof(arr1)/sizeof(arr1[0]) + sizeof(arr2)/sizeof(arr2[0]);
    int arr[size];

    int i=0,j=0,k=0;

    int size1=sizeof(arr1)/sizeof(arr1[0]);
    int size2=sizeof(arr2)/sizeof(arr2[0]);

    while(i<size1 && j<size2){
        if(arr1[i] > arr2[j]){
            arr[k++]=arr1[i];
            i+=1;
        }else{
            arr[k++]=arr2[j];
            j+=1;
        }
    }

    while(i<size1){
        arr[k++]=arr1[i++];
    }

    while(j<size2){
        arr[k++]=arr2[j++];
    }




    return 0;
}