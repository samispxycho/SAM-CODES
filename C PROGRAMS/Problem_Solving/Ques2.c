#include<stdio.h>

int main(){

    int side1,side2,side3;
    printf("Enter the sides of a triangle: ");
    scanf("%d%d%d",&side1,&side2,&side3);

    if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
        printf("It is a valid triangle \n");
    }else{
        printf("Not a valid triangle \n");
    }

    if(side1 == side2 && side2 == side3){
        printf("equilateral triangle");
    }else if(side1 == side2 || side2 == side3 || side3 == side1){
        printf("Isoceles triangle");
    }else{
        printf("Scanlene triangle");
    }


    return 0;
}