#include<stdio.h>
#include<stdlib.h>

int main(){

    int size;
    printf("Enter size of array: ");
    scanf("%d",&size);

    int *p=NULL;
    p=(int*)malloc(size*sizeof(int));

    printf("Enter values: ");
    for(int i=0;i<size;i++){
        scanf("%d", p+i);
    }

    int sum=0; 
    for(int i=0;i<size;i++){
        sum+=*(p+i);
    }
    printf("%d",sum);

    return 0;
}