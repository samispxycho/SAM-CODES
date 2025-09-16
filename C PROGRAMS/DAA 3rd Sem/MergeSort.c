#include<stdio.h>

void merge(int arr[],int l,int m,int r){

    int n1 = m-l+1;
    int n2 = r-m;

    int L[n1]; int R[n2];

    for(int i=0;i<n1;i++){
        L[i] = arr[l+i];
    }

    for(int j=0;j<n2;j++){
        R[j] = arr[m+1+j];
    }

    int i=0; int j=0; int k=l;

    while(i<n1 && j<n2){
        if(L[i] <= R[j]){
            arr[k] = L[i];
            k++; i++;
        }else{
            arr[k] = R[j];
            k++; j++;
        }
    }

    while(i<n1){
        arr[k] = L[i];
        k++; i++;
    }

    while(j<n2){
        arr[k]=R[j];
        k++;j++;
    }

}

void mergeSort(int arr[],int l,int r){
    if(l<r){
        int m = (l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}

int main(){

    int arr[] = {10,9,8,7,6,5,4,3,2,1};
    int n = 10;

    mergeSort(arr,0,n-1);

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    return 0;
}