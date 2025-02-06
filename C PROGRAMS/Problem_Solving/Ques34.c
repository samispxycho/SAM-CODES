#include<stdio.h>

#define row 3
#define col 3


void MultiMat(int matrix1[row][col], int matrix2[row][col], int product[row][col]){

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            product[i][j] = 0;
            for(int k=0;k<row;k++){
                product[i][j] = product[i][j] + matrix1[i][k] * matrix2[k][j];
            }
        }
    }

}


void printMat(int arr[row][col]){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}


int main(){

    int matrix1[row][col]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int matrix2[row][col]={
        {10,11,12},
        {13,14,15},
        {16,17,18}
    };

    printf("Original matrix 1: \n");
    printMat(matrix1);

    printf("\nOriginal matrix 2: \n");
    printMat(matrix2);

    int arr[row][col];

    MultiMat(matrix1,matrix2,arr);

    printf("\nMultiplied matrix: \n");
    printMat(arr);

    return 0;
}