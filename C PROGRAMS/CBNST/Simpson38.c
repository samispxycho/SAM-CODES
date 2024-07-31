#include<stdio.h>
#include<math.h>

float eqn(float x){
    float ans;
    ans=(1/(1+pow(x,2)));
    return ans;
}

void main(){
    
    float a=0;
    float b=6;
    float n=6;

    float h=((b-a)/n);

    float first_last=0;
    float mul_of_3=0;
    float not_mul=0;

    float x=a;

    for(int i=a;i<=n;i++){
        if(i==a || i==n){
            first_last+=eqn(x);
        }else if(i%3==0){
            mul_of_3+=eqn(x);
        }else if(i%3!=0){
            not_mul+=eqn(x);
        }
        x=x+h;
    }

    float total=first_last+(3*not_mul)+(2*mul_of_3);

    float ans=(((3*h)/8)*total);
    printf("%f",ans);

}