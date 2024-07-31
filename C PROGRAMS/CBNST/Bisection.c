#include<stdio.h>
#include<math.h>

float eqn(float x){
    float ans;
    ans=((pow(x,3))-(4*x)-9);
    return ans;
}

void main(){

    float x1=2;
    float x2=3;

    float x3,z;


    int i=1;
    do{
        printf("Iteration number: %d\n",i++);

        x3=((x1+x2)/2);
        printf("x3: %f \n",x3);

        z=eqn(x3);

        if(z>=0){
            x2=x3;
        }else{
            x1=x3;
        }
    }while(fabs(x1-x2)>=0.000001);

}