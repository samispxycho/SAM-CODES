#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<windows.h>

int main(){

    FILE *fp;
    fp = fopen("Ques38.txt","r");

    char fetched[11];
    int index=0;

    char ch = fgetc(fp);
    while(ch!=EOF){
        fetched[index] = ch;
        index++;
        ch=fgetc(fp);
    }

    char substr[10];
    printf("Enter the substring you want to search: ");
    gets(substr);

    for(int i=0;i<=strlen(fetched)-strlen(substr);i++){

        int found = 1;

        for(int j=0;j<strlen(substr);j++){
            if(fetched[i+j]!=substr[j]){
                found = 0;
                break;
            }
        }

        if(found==1){
            printf("Substring found");
            return 0;
        }
    }

    printf("Substring not found");

    return 0;
}