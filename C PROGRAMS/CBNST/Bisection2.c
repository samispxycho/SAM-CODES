#include<stdio.h>
#include<math.h>

double equation(double x){
    double f;
    f=((x*x)-5);
    return f;
}

void main(){
    float x1=2;
    float x2=3;
    float x3,z;

    double range=0.000001;
    int i=1;

    do{
        printf("Iteration number:%d \n",i);
        printf("x1:%f \t",x1);
        printf("x2:%f \t",x2);

        x3=(x1+x2)/2;
        printf("x3:%f \n",x3);

        z=equation(x3);
        if(z>=0){
            x2=x3;
        }else{
            x1=x3;
        }
        
        i++;
        printf("-------------------------------------------------------------------------\n");
    }while(fabs(x1-x2)>range);
}