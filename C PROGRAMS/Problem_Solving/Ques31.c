#include<stdio.h>
#include<string.h>

int main(){

    char str1[]="hello world";
    char str2[]="world";

    for(int i=0;i<=strlen(str1)-strlen(str2);i++){
        int found = 1;

        for(int j=0;j<strlen(str2);j++){
            if(str1[i+j] != str2[j]){
                found = 0;
                break;
            }
        }

        if(found == 1){
            printf("Substring found at index: %d",i);
            return 0;
        }
    }
    
    return 0;

}