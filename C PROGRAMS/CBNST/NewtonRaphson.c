#include<stdio.h>
#include<math.h>
#include<conio.h>

float equation(float x){
    float f;
    f=((x*x*x*x)-x-10);
    return f;
}

float formula(float x,float fn,float f_n){
    x=(x-(fn/f_n));
    return x;
}

float differ(float x){
    float dr;
    dr=(4*(x*x*x)-1);
    return dr;
}

void main(){

    float x=2;         //Larger interval
    float fx,f_x,z;

    int i=1;
    float range=0.00005;

    do{
        printf("Iteration number:%d \n",i++);

        printf("x1:%f \t",x);
        fx=equation(x);
        printf("f(x):%f \t",fx);
        f_x=differ(x);
        printf("f_x:%f \n",f_x);

        z=formula(x,fx,f_x);
        x=z;

        printf("-----------------------------------------------------------------------------\n");
    }while(fabs(equation(x))>range);

}