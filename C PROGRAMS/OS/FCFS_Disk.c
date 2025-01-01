#include<stdio.h>
#include<stdlib.h>

void FCFSD(int arr[], int len, int head){

    int total_seek = 0;

    printf("Sequence: ");
    for(int i=0;i<len;i++){
        printf("%d  ",arr[i]);
        int d = abs(head-arr[i]);
        total_seek += d;
        head = arr[i];
    }
    printf("\nTotal seek time: %d",total_seek);

}

int main(){

    int arr[]={45,54,53,23,34};
    int head = 45;

    int len = sizeof(arr)/sizeof(arr[0]);
    FCFSD(arr,len,head);

    return 0;
}