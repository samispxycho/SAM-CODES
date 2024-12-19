#include<stdio.h>

#define row 3
#define col 3

void transpose(int matrix[row][col], int arr[row][col]){
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[j][i] = matrix[i][j];
        }
    }

}

void printArr(int matrix[row][col]){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d ",matrix[i][j]);
        }
        printf("\n");
    }
}

int main(){

    int matrix[row][col]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int arr[row][col];

    printArr(matrix);
    printf("\n\n\n\n\n");
    transpose(matrix,arr);
    printArr(arr);


    return 0;
}