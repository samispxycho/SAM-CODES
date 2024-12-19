#include<stdio.h>

#define row 3
#define col 3

void printArr(int arr[row][col]){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}

void matMul(int matrix1[row][col], int matrix2[row][col], int product[row][col]){
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            product[i][j] = 0;
            for(int k=0;k<col;k++){
                product[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }

}

int main(){

    int matrix1[row][col]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int matrix2[row][row]={
        {10,11,12},
        {13,14,15},
        {16,17,18}
    };

    printf("Original matrix 1 \n");
    printArr(matrix1);

    printf("\nOriginal matrix 2\n");
    printArr(matrix2);

    int arr[row][col];

    matMul(matrix1,matrix2,arr);

    printf("\n\n\nAfter multiplication\n");
    printArr(arr);


    return 0;
}