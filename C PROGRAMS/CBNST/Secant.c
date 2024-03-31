#include<stdio.h>
#include<math.h>
#include<conio.h>

float equation(float x){
    float f;
    f=((x*x*x)-x-1);
    return f;
}

float formula(float x1,float x2,float f1, float f2){
    float z;
    z=(((x1*f2)-(x2*f1))/(f2-f1));
    return z;
}

void main(){
    float x1=1;
    float x2=2;
    float f1,f2,x3,f3;

    int i=1;
    float range=0.00001;

    do{
        printf("Interval number:%d \n",i);
        printf("x1:%f \t",x1);
        printf("x2:%f \t",x2);

        f1=equation(x1);
        f2=equation(x2);
        printf("f(x1):%f \t",f1);
        printf("f(x2):%f \n",f2);

        x3=formula(x1,x2,f1,f2);
        f3=equation(x3);

        x1=x2;
        x2=x3;

        i++;
        printf("---------------------------------------------------------------------------\n");
    }while(fabs(f3)>range);

}