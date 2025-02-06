#include<stdio.h>

double fact(int num){
    int f=1;
    while(num>0){
        f=f*num;
        num--;
    }
    return f;
}

double sumSeries(int x,int n){

    double sum = 0;
    for(int i=1;i<=n;i++){
        double d = (x*i)/fact(2*i);
        sum+=d;
    }
    return sum;
}

int main(){

    int n;
    printf("Enter number of terms: ");
    scanf("%d",&n);

    int x;
    printf("Enter value of x: ");
    scanf("%d",&x);

    double result = sumSeries(x,n);
    printf("%f",result);

    return 0;
}