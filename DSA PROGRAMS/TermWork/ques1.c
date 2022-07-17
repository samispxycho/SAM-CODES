//Program to store N elements and then sort all the +ve value towards the right 
//side of the zero.

#include<stdio.h>
#define max 100

//Function prototype
void sort(int[],int);

int main()
{
    int a[max],i,j,n;
    printf("Enter the size of the array you want to create\n");
    scanf("%d",&n);

    printf("Enter the elements you want to sort\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Before sorting\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }

    sort(a,n);

    printf("\nAfter sorting\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }

    return 0;
}

void sort(int a[],int n)
{
    int temp;

    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(a[j]>=0 && a[j+1]<0)
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}