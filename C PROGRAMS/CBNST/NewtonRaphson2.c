#include<stdio.h>
#include<math.h>

float equation(float x){
    float f;
    f=((x*x*x)-(3*x)-5);
    return f;
}

float formula(float x,float fx,float f_x){
    x=(x-(fx/f_x));
    return x;
}

float differ(float x){
    float dr;
    dr=(3*(x*x)-3);
    return dr;
}

void main(){
    float x=3;
    float fx,f_x;
    

    int i=1;
    float range=0.00005;

    do{
        printf("Iteration number:%d \n",i++);
        printf("x:%f \t",x);

        fx=equation(x);
        f_x=differ(x);
        printf("fx:%f \t",fx);
        printf("f_x:%f \n",f_x);

        x=formula(x,fx,f_x);

        printf("-------------------------------------\n");
    }while(equation(fx)>range);

}