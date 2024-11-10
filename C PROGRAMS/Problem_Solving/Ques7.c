#include<stdio.h>
int main(){

    int number;
    printf("Enter binary number: ");
    scanf("%d",&number);

    int binary[32];
    int octal[32];
    char hexa[32];

    int i = 0;

    int temp = number;

    if(number == 0){
        printf("0");
    }
    
    while(temp > 0){
        binary[i] = temp % 2;
        temp = temp/2;
        i++;
    }

    int j;
    for(j=i-1;j>=0;j--){
        printf("%d",binary[j]);
    }

    printf("\n");
    temp = number;
    i=0;

    while(temp > 0){
        octal[i] = temp%8;
        temp = temp/8;
        i++;
    }

    for(j=i-1;j>=0;j--){
        printf("%d",octal[j]);
    }

    printf("\n");

    temp = number;
    i=0;

    while(temp>0){
        int rem = temp % 16;
        if(rem<10){
            hexa[i] = rem + '0';
        }else{
            hexa[i] = rem - 10 + 'A';
        }

        temp = temp / 16;
        i++;
    }

    for(j=i-1;j>=0;j--){
        printf("%c",hexa[j]);
    }


    return 0;
}