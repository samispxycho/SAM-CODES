#include<stdio.h>
#include<string.h>
int main(){

    char str[20];
    char sub[10];

    gets(str);
    fflush(stdin);
    gets(sub);

    for(int i=0;i<strlen(str);i++){
        
        int found = 1; //assume

        for(int j=0;j<strlen(sub);j++){
            if(str[i+j]!=sub[j]){
                found = 0;
                break;
            }
        }

        if(found==1){
            printf("Substring found");
            return 0;
        }
    }

    printf("Not found");



    return 0;
}