#include<stdio.h>
#include<math.h>

float eqn(float x){
    float ans;
    ans=((x*x*x)-(3*x)+1);
    return ans;
}

float formula(float x1,float x2,float f1,float f2){
    float x3;
    x3=(((x1*f2)-(x2*f1))/(f2-f1));
    return x3;
}

void main(){

    float x1=1;
    float x2=2;

    float f1,f2,x3,f3;

    int i=1;
    do{
        printf("Iteration number: %d\n",i++);

        printf("x1: %f \n",x1);
        printf("x2: %f \n",x2);

        f1=eqn(x1);
        f2=eqn(x2);
        printf("f1: %f \n",f1);
        printf("f2: %f \n",f2);

        x3=formula(x1,x2,f1,f2);
        printf("x3: %f \n",x3);

        f3=eqn(x3);
        printf("f3: %f \n",f3);

        if(f3>=0){
            x2=x3;
        }else{
            x1=x3;
        }

    }while(fabs(f3)>0.0001);

}