#include<stdio.h>
#include<math.h>

void pallin(int ele,int *countP){
    int temp=ele;
    int rev=0;
    while(temp>0){
        int d=temp%10;
        rev=(rev*10)+d;
        temp=temp/10;
    }
    if(rev==ele){
        (*countP)+=1;
    }
}

void prime(int ele,int *countPrime){
    int c=0;
    for(int i=1;i<=ele;i++){
        if(ele%i==0)c+=1;
    }
    if(c==2){
        (*countPrime)+=1;
    }
}

void armstrong(int ele,int *arms){
    int len=0;
    int temp=ele;
    while(temp>0){
        len+=1;
        temp=temp/10;
    }

    int sum=0;

    temp=ele;
    while(temp>0){
        int d=temp%10;
        sum=sum+(int)round(pow(d,len));
        temp=temp/10;
    }

    if(sum==ele){
        (*arms)+=1;
    }

}

int main(){

    int arr[6]={123,345,567,121,222,153};

    int countP=0;
    int countPrime=0;
    int arms=0;

    for(int i=0;i<6;i++){
        pallin(arr[i],&countP);
        prime(arr[i],&countPrime);
        armstrong(arr[i],&arms);
    }

    printf("Number of pallindrome count: %d\n",countP);
    printf("Number of prime count: %d\n",countPrime);
    printf("Number of armstrong: %d\n",arms);
    

    return 0;
}