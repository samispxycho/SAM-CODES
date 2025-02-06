#include<stdio.h>
#include<string.h>
int main(){

    char str[]="sameer upadhyay";
    char arr[26]={0};

    for(int i=0;i<strlen(str);i++){
        int pos = str[i] - 'a';
        arr[pos]++;
    }

    for(int i=0;i<26;i++){
        if(arr[i]!=0){
            char ch = i + 'a';
            printf("Count of %c is %d\n",ch,arr[i]);
        }
    }




    return 0;
}