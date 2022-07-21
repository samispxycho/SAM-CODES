#include<stdio.h>
#define max 50

void swap(int *a, int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}

int partition(int a[],int lb,int ub)
{
    int pivot=a[lb];
    int start=lb,end=ub;

    while(start<end)
    {
        while(a[start]<=pivot)
        {
            start++;
        }
        while(a[end]>pivot)
        {
            end--;
        }
        if(start<end)
        {
            swap(&a[end],&a[start]);
        }
    }

    swap(&a[lb],&a[end]);
    return end;
}

void quick(int a[],int lb,int ub)
{
    int loc;
    if(lb<ub)
    {
        loc=partition(a,lb,ub);
        quick(a,loc+1,ub);
        quick(a,lb,loc-1);
    }
}

int main()
{
    int a[max],ub,lb=0;
    printf("Enter the size\n");
    scanf("%d",&ub);

    printf("Enter elements\n");
    for(int i=0;i<ub;i++)
    {
        scanf("%d",&a[i]);
    }

    quick(a,lb,ub);

    printf("Sorted\n\n");
    for(int i=0;i<ub;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}