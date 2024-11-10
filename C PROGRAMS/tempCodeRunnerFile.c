#include<stdio.h>
void main(){
    
    int n1 = 5;
    int n2 = 17;

    int i;
    int j;
    for(i=n1;i<=n2;i++){
        int count=2;
        for(j=2;j<=i/2;j++){
            if(i%j==0)count++;
        }
        if(count == 2)printf ("%d \n", i);
    }
    
}