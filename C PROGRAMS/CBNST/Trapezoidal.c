#include<stdio.h>
#include<math.h>

float eqn(int x){
    float ans;
    ans=(1/(1+pow(x,2)));
    return ans;
}

void main(){

    float a=0;
    float b=6;
    float n=6;

    float h=((b-a)/n);

    float x=a;
    float first_last=0;
    float rest=0;

    for(int i=a;i<=n;i++){
        if(i==a || i==n){
            first_last+=eqn(x);
        }else{
            rest+=eqn(x);
        }
        x=x+h;
    }

    rest=rest*2;

    float ans=((h/2)*(first_last+rest));

    printf("Answer is: %f",ans);


}