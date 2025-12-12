#include <stdio.h>

void towerOfHanoi(int n, char from, char to, char help){
    if(n==1){
        printf("Move disk from %c to %c\n", from, to);
        return;
    }
    
    towerOfHanoi(n-1, from, help, to);
    printf("Move disk from %c to %c\n", from, to);
    towerOfHanoi(n-1, help, to, from);
}

int main() {
    
    int n;
    printf("Enter number of disks: ");
    scanf("%d",&n);
    
    towerOfHanoi(n, 'A', 'C', 'B');

    return 0;
}