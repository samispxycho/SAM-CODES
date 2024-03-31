#include<stdio.h>
#include<math.h>

float equation(float x){
    float f;
    f=((x*x*x)-(2*x)-5);
    return f;
}

void main(){
    float x1=2;
    float x2=3;
    float x3,z;
    
    int i=1;
    float range=0.00005;

    do{
        printf("Iteration number:%d \n",i++);
        printf("x1:%f \t",x1);
        printf("x2:%f \t",x2);

        x3=((x1+x2)/2);
        printf("x3:%f \n",x3);
        z=equation(x3);

        if(z>=0){
            x2=x3;
        }else{
            x1=x3;
        }
        printf("-----------------------------------------------------------\n");

    }while(fabs(x1-x2)>range);

}