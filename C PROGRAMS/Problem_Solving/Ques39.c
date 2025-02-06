#include<stdio.h>
#define row 3
#define col 3

void checkIdentity(int matrix[row][col]){

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i==j && matrix[i][j]!=1){
                printf("Not identity");
                return;
            }
            if(i!=j && matrix[i][j]!=0){
                printf("Not identity");
                return;
            }
        }
    }

    printf("Identity matrix confirmed");

}

int main(){

    int matrix[row][col]={
        {1,0,0},
        {0,1,0},
        {0,0,1}
    };

    checkIdentity(matrix);

    return 0;
}