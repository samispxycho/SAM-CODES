#include<stdio.h>

int length(char *str);

void *reverse(char *str){
    int first=0;
    int last=length(str)-1;

    while(first<last){
        char temp=str[first];
        str[first]=str[last];
        str[last]=temp;

        first++;
        last--;
    }

    return str;
}

int length(char *str){
    int i;
    for(i=0; str[i]!='\0';i++);
    return i;
}

int main(){

    char str[]="computer";

    int len = length(str);
    printf("%d",len);
    char *rev=reverse(str);
    printf("%s",rev);

    return 0;
}