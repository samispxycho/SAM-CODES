//Searching through binary search

#include<stdio.h>

int main()
{
    int a[5]={10,20,30,40,50},lb=0,ub=4,item,mid,f=0;
    printf("Enter the element you want to search\n");
    scanf("%d",&item);

    while(lb<=ub)
    {
        mid=(lb+ub)/2;
        if(a[mid]==item)
        {
            f=1;
            break;
        }
        if(a[mid]<item)
        {
            lb=mid+1;
        }
        else
        {
            ub=mid-1;
        }
    }
    if(f==1)
    {
        printf("Element found at position %d\n",mid);
    }
    else
    {
        printf("Element not found\n");
    }
}