//Syntax of all the functions in the last after the program
//All the functions are stored in the library #include<stdlib.h>

#include<stdio.h>
#include<stdlib.h>

int main()
{
    //Asking size and printing the data using malloc function

    int *ptr,size;
    printf("Enter the size of the array you want to create\n");
    scanf("%d",&size);

    ptr=(int*)malloc(size*sizeof(int));
    for(int i=0;i<size;i++)
    {
        scanf("%d",&ptr[i]);
    }

    printf("Elements entered are\n");
    for(int i=0;i<size;i++)
    {
        printf("%d",ptr[i]);
        printf("\n");
    }


    //Asking size and printing the data using calloc function

    int *ptr,size;
    printf("Enter the size of the array you want to create");
    scanf("%d",&size);

    ptr=(int*)calloc(size, sizeof(int));
    for(int i=0;i<size;i++)
    {
        scanf("%d",&ptr[i]);
    }

    printf("Entered elements are\n");
    for(int i=0;i<size;i++)
    {
        printf("%d",ptr[i]);
        printf("\n");
    }
    

    //Use of realloc and free function in the same program

    int *ptr,size;
    printf("Enter the size of the array you want to create");
    scanf("%d",&size);

    ptr=(int*)calloc(size, sizeof(int));
    for(int i=0;i<size;i++)
    {
        scanf("%d",&ptr[i]);
    }

    printf("Entered elements are\n");
    for(int i=0;i<size;i++)
    {
        printf("%d",ptr[i]);
        printf("\n");
    }

    int x;
    printf("Enter the new size of array you want to create\n");
    scanf("%d",&x);

    ptr=(int*)realloc(ptr, x*sizeof(int));
    for(int i=0;i<x;i++)
    {
        scanf("%d",&ptr[i]);
    }

    printf("Elements entered after increasing the size are\n");
    for(int i=0;i<x;i++)
    {
        printf("%d",ptr[i]);
        printf("\n");
    }
    //realloc function ends

    //demonstration of free() function
    free(ptr);

    return 0;
}


/*Syntax of malloc, calloc, realloc and free functions

malloc: ptr=(ptr_type*)malloc(size_in_bytes);
calloc: ptr=(ptr_type*)calloc(n, size_in_bytes);
realloc: ptr=(ptr_type)realloc(ptr, new_size_in_bytes);
free: free(ptr);

*/