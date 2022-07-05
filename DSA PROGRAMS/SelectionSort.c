#define max 100
#include<stdio.h>

int main()
{
    int a[max],limit,i,j,min,temp;
    printf("Enter the size of array you want to create\n");
    scanf("%d",&limit);

    printf("Enter the data elements\n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }

    //selection sort
    for(i=0;i<limit-1;i++)
    {
        min=i;
        for(j=i+1;j<limit;j++)
        {
            if(a[min]>a[j])
            {
                min=j;
            }
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }

    printf("Sorted elements are\n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }

    return 0;
}