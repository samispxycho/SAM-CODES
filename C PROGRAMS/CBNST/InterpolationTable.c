#include<stdio.h>
#include<math.h>

void put_NAN(float table[6][6]){
    for(int i=0;i<6;i++){
        for(int j=0;j<6;j++){
            table[i][j]=NAN;
        }
    }
}

void print_table(float table[6][6]){
    for(int i=0;i<6;i++){
        for(int j=0;j<6;j++){
            if(!isnan(table[i][j])){
                printf("\t%f\t",table[i][j]);
            }
        }
    }
}

void main(){

    int n=6;
    float table[n][n];

    put_NAN(table);

    table[0][0]=1;
    table[1][0]=2;
    table[2][0]=3;
    table[3][0]=4;
    table[4][0]=5;
    table[5][0]=6;

    for(int i=1;i<n;i++){
        for(int j=0;j<=n-i-1;j++){
            table[i][j]=table[j+1][i-1]-table[j][i-1];
        }
    }

    print_table(table);

}