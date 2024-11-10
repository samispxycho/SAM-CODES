#include<stdio.h>
int main(){

    char ch;
    printf("Enter a character: ");
    scanf("%c",&ch);

    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
        printf("It is an alphabet");
    }else if(ch>='0' || ch<='9'){
        printf("It is a number");
    }else{
        printf("It is a special character");
    }

    return 0;
}