#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<string.h>

int main(){

    FILE *fp1;
    fp1=fopen("Ques24.txt","w");

    //Checking if file creation is sucessfull or not
    if(fp1==NULL){
        printf("File cant be created.");
        exit(1);
    }else{
        printf("\nFile sucessfully created");
    }

    char str[50];
    printf("\nPlease enter the data you want to insert in the file: ");
    gets(str);

    for(int i=0;i<strlen(str);i++){
        fputc(str[i],fp1);
    }

    fclose(fp1);

    FILE *fp2;
    fp2=fopen("Ques24.txt","r");

    printf("\nData in the file: ");
    char ch = fgetc(fp2);
    while(ch!=EOF){
        Sleep(50);
        printf("%c",ch);
        ch=fgetc(fp2);
    }

    rewind(fp2);

    int total=0;
    int upper=0;
    int lower=0;
    int spaces=0;
    int digits=0;
    int lines=1;

    ch=fgetc(fp2);
    while(ch!=EOF){

        if(ch>='A' && ch <= 'Z')upper++;
        else if(ch>='a' && ch<='z')lower++;
        else if(ch==' ')spaces++;
        else if(ch>='1' && ch<='9')digits++;
        else if(ch=='\n')lines++;
        total++;

        ch=fgetc(fp2);

    }
    printf("\nTotal characters including all: %d",total);
    printf("\nUpper case characters: %d",upper);
    printf("\nLower case characters: %d",lower);
    printf("\nTotal spaces: %d",spaces);
    printf("\nTotal digits: %d",digits);
    printf("\nTotal Lines: %d",lines);

    return 0;
}