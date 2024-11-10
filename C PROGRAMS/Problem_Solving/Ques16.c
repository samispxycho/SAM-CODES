#include<stdio.h>
#include<math.h>

int fact(int num) {
    int res = 1;
    for (int i = 1; i <= num; i++) {
        res *= i; // Calculate factorial
    }
    return res;
}

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    float sum = 0;
    
    for (int i = 1; i <= n; i++) {
        sum += (float)pow(i,i) / fact(i); 
    }

    printf("Sum: %f\n", sum); // Print the sum with a label
    return 0;
}
