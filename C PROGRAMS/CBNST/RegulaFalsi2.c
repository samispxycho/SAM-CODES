#include<stdio.h>
#include<math.h>

float equation(float x){
    float f;
    f=((x*x)-5);
    return f;
}

float formula(float x1,float x2,float f1,float f2){
    float z;
    z=(((x1*f2)-(x2*f1))/(f2-f1));
    return z;
}

void main(){

    float x1=2;
    float x2=3;
    float f1,f2,x3,f3;

    int i=1;
    float range=0.0001;

    do{
        printf("Iteration number:%d \n",i);
        printf("x1:%f \t",x1);
        printf("x2:%f \t",x2);

        f1=equation(x1);
        f2=equation(x2);
        printf("f(x1):%f \t",f1);
        printf("f(x2):%f \n",f2);

        x3=formula(x1,x2,f1,f2);
        f3=equation(x3);

        if(f3>=0){
            x2=x3;
        }else{
            x1=x3;
        }

        i++;
        printf("---------------------------------------------------------------------\n");
    }while(fabs(f3)>range);

}