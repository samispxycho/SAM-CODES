#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<windows.h>

int main(){

    FILE *fp1;
    fp1 = fopen("Ques27.txt","w");

    char str[]= "Hello World";
    fputs(str,fp1);

    //fseek is used to move the cursor position
    fseek(fp1,0,2);

    int len = ftell(fp1);
    printf("%d",len);


    fclose(fp1);

    return 0;
}