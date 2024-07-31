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

    float even=0;
    float odd=0;
    
    float x=a;

    int flag=1;

    for(int i=a;i<=n;i++){
        if(i%2==0){
            even+=eqn(x);
        }else{

            float temp=0;

            if(flag==1){
                temp=eqn(x);
                temp=temp*5;
                flag=0;
            }else{
                temp=eqn(x);
                temp=temp*6;
                flag=1;
            }
            odd+=temp;
        }
        x=x+h;
    }

    float total=even+odd;

    float ans=(((3*h)/10)*total);
    printf("%f",ans);

}

