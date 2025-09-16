#include<stdio.h>
#include<math.h>

void tower(int n,char from,char to,char help){
    if(n==1){
        printf("Move disk 1 from %c to %c\n",from,to);
        return;
    }
    tower(n-1,from,help,to);
    printf("Move disk %d from %c to %c\n",n,from,to);
    tower(n-1,help,to,from);
}

int main(){

    int n;
    printf("Enter number of disks: ");
    scanf("%d",&n);

    tower(n,'A','C','B');

    int steps = pow(2,n)-1;
    printf("Number of steps taken: %d",steps);

    return 0;
}