#include<stdio.h>
#define CAPACITY 100

int main()
{
    int a[CAPACITY],i,j,limit,temp,min;
    printf("Enter the size of the array you want to create\n");
    scanf("%d",&limit);

    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }

    //Before printing
    printf("Before sorting: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }

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

    //After sorting
    printf("\nAfter sorting: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}