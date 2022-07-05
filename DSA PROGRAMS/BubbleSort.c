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

    //bubble sort

    for(i=0;i<limit-1;i++)
    {
        for(j=0;j<limit-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }

    printf("Sorted elements are \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }

    return 0;
}