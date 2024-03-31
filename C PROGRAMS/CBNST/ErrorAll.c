#include<stdio.h>
#include<math.h>

void main(){
    float act_val,approx,error,ae,re,pe;

    printf("Enter the actual value: ");
    scanf("%f", &act_val);

    printf("Enter approx value: ");
    scanf("%f",&approx);

    error=act_val-approx;

    ae=fabs(error);
    re=ae/act_val;
    pe=re*100;

    printf("Absolute Error:%f \n",ae);
    printf("Relative Error:%f \n",re);
    printf("Percentage Error:%f \n",pe);


}