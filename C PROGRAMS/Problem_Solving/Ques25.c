#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<windows.h>

struct library{
    int bookID;
    char bookName[20];
    float bookPrice;
}typedef library;

int main(){
    
    library book1;

    printf("\nEnter book ID: ");
    scanf("%d",&book1.bookID);
    fflush(stdin);

    printf("\nEnter book Name: ");
    gets(book1.bookName);

    printf("\nEnter book price: ");
    scanf("%f",&book1.bookPrice);

    FILE *fp1;
    fp1 = fopen("Ques25.txt","wb");

    if(fp1==NULL)printf("\nFile was not created");
    else printf("\nFile created sucessfully");

    fwrite(&book1,sizeof(book1),1,fp1); //kaha se write, kitna write, how many records, file pointer

    fclose(fp1);

    FILE *fp2;
    fp2=fopen("Ques25.txt","rb");
    library book2;
    fread(&book2,sizeof(book2),1,fp2);  //kaha pe store read krke, kitna store, how many records, file pointer

    printf("\nBook ID: %d",book2.bookID);
    printf("\nBook NAME: %s",book2.bookName);
    printf("\nBook ID: %f",book2.bookPrice);

    fclose(fp2);

    return 0;
}