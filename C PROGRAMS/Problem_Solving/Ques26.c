#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<windows.h>

int main(){

    FILE *fp;
    fp=fopen("Ques26.txt","w");

    if(fp==NULL){
        printf("File was not created");
        exit(1);
    }else{
        printf("\nFile created sucessfully");
    }

    int num1,num2;
    printf("\nEnter two numbers: ");
    scanf("%d%d",&num1,&num2);
    fprintf(fp,"%d,%d,%d",num1,num2,num1+num2);

    fclose(fp);

    int n1,n2,sum;
    FILE *fp2;
    fp2=fopen("Ques26.txt","r");
    fscanf(fp2,"%d,%d,%d",&n1,&n2,&sum);
    
    printf("\nFirst number is: %d",n1);
    printf("\nSecond number is: %d",n2);
    printf("\nSum number is: %d",sum);

    fclose(fp2);

    return 0;
}