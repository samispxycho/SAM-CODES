#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<windows.h>

int main(){

    FILE *fp;

    //to create a file
    fp=fopen("Ques23.txt","w");
    if(fp==NULL){
        printf("File cant be created\n");
        exit(1);
    }

    //input static data into the file-character by character
    char str[]="The one piece is real\n";
    for(int i=0;i<strlen(str);i++){
        fputc(str[i],fp);       
    }

    //input dynamic data into the file-character by character
    char str2[100];
    printf("Enter the data you want to input in the file: ");
    gets(str2);
    for(int i=0;i<strlen(str2);i++){
        fputc(str2[i],fp);
    }

    //input static data into the file - in one go
    char str3[]="\nKing of the pirates\n";
    fputs(str3,fp);

    //input dynamic data into the file - in one go
    char str4[100];
    printf("Enter the data you want to input in the file: ");
    gets(str4);
    fputs(str4,fp);

    fclose(fp);


    FILE *fp2;
    fp2=fopen("Ques23.txt","r");

    //read data from file-character by character
    char ch = fgetc(fp2);    
    while(ch != EOF){
        Sleep(10);
        printf("%c",ch);
        ch = fgetc(fp2);
    }

    rewind(fp2);
    printf("\n");

    //read data from file-in one go
    char str5[200];
    while(fgets(str5,sizeof(str5),fp2)!=NULL){
        printf("%s",str5);
    }

    fclose(fp2);
    
    return 0;
}