#include<stdio.h>
#include<math.h>

float equation(float x){
    float f;
    f=((x*x*x)-(4*x)-9);
    return f;
}

void main(){
    int x1,x2;

    for(int i=0;i<=10;i++){
        x1=equation(i);
        x2=equation(i+1);

        if((x1<0 && x2>=0) || (x2<0 && x1>=0)){
            printf("Intervals are: %d and %d",i,i+1);
            break;
        }
    }
}