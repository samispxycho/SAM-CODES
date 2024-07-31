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
    float even=0;
    float odd=0;

    float x=a;

    for(int i=a;i<=n;i++){
        if(i==a || i==n){
            first_last+=eqn(x);
        }else if(i%2==0){
            even+=eqn(x);
        }else if(i%2!=0){
            odd+=eqn(x);
        }

        x=x+h;
    }

    

    float total=first_last+(4*odd)+(2*even);

    float ans=((h/3)*total);

    printf("%f",ans);

}