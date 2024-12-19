#include<stdio.h>
#include<string.h>
int main(){

    char str[]="abc";
    char arr[26]={0};

    for(int i=0;i<strlen(str);i++){
        int pos = str[i] - 'a';
        arr[pos]++;
    }

    for(int i=0;i<26;i++){
        if(arr[i]!=0){
            int ch = i + 'a';
            printf("\nFrequency of %c is %d",ch, arr[i]);
        }
    }




    return 0;
}