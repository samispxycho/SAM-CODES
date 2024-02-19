#include<stdio.h>
#define CAPACITY 100

int main()
{
    int a[CAPACITY],i,j,limit,temp;

    printf("Enter the size of array you want to create\n");
    scanf("%d",&limit);

    printf("Enter the elements you want to sort\n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Before sorting: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }

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

    printf("\nAfter sorting: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }
    
    return 0;
}