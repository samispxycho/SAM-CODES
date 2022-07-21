//Program to search a number using linear search

#include<stdio.h>
#define max 100

int main()
{
    int a[max],i,limit,ele;
    printf("Enter the size of the array you want to create\n");
    scanf("%d",&limit);

    printf("Enter the elements\n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the element you want to find the position of\n");
    scanf("%d",&ele);

    for(i=0;i<limit;i++)
    {
        if(a[i]==ele)
        {
            printf("Element found at position %d\n",i);
        }
    }
    i++;

    return 0;
}