#include<stdio.h>

struct book{
    int bookid;
    char bookName[20];
    float price;
}typedef book;

book input(){
    book b;
    printf("Enter book id: ");
    scanf("%d",&b.bookid);
    printf("Enter book name: ");
    fflush(stdin);
    gets(b.bookName);
    printf("Enter book price: ");
    scanf("%f", &b.price);

    return b;
}

void display(book b){
    printf("Book id is: %d\n",b.bookid);
    printf("Book name is: %s\n",b.bookName);
    printf("Book price is: Rupees: %f\n",b.price);
}


int main(){

    book book1;   
    book1=input();
    display(book1);

    return 0;
}