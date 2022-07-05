#define max 100
#include<stdio.h>

int main()
{
    int a[max],limit,i,j,temp;
    printf("Enter the size of array you want to create\n");
    scanf("%d",&limit);

    printf("Enter the data elements\n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }

    //insertion sort 
    for(i=1;i<limit;i++)
    {
        temp=a[i];
        j=i-1;

        while(j>=0 && a[j]>temp)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=temp;
    }

    printf("Sorted elements are\n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }
    
    return 0;
}