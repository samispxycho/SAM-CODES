#include<stdio.h>
int main()
{
    
    int a[5]={0,1,2,3,4};                //compile time initialization of an array.
    printf("%d",a[3]);  

    int a[5]={0,1,2,3,4};                //exceeding limit condition.
    printf("%d",a[6]);  

    int a[5]={0,1};                     //Condition where all the elements are not  
    printf("%d",a[3]);                  //not declared.
    


    int s[10];                          //Run time initialization of an array.
    printf("Enter the elements\n");
    for(int i=0;i<10;i++)
    {
        scanf("%d",&s[i]);
    }
    


    //Program to initialize an array by asking the size and elements from the user and than later
    //printing the entered data

    int s[100],size,i;         

    printf("Enter the size of the array\n");                //asking the size
    scanf("%d",&size);

    printf("Enter the elements you want to store\n");       //asking user to enter the data
    for(i=0;i<size;i++)
    {
        scanf("%d",&s[i]);
    }

    printf("\nEntered elements are\n");                     //printing the elements entered
    for(i=0;i<size;i++)
    {
        printf("%d",s[i]);
        printf("\n");
    }

    return 0;
}