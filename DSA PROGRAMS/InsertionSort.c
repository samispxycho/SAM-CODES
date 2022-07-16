#include<stdio.h>
#define CAPACITY 100

int main()
{
    int a[CAPACITY],limit,temp,i,j;
    printf("Enter the size of the array you want to create\n");
    scanf("%d",&limit);

    printf("Enter the elements\n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Before sorting: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }

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

    //After sorting
    printf("\nAfter sorting: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}