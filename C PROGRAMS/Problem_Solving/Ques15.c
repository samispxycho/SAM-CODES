#include<stdio.h>

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
        // Ensure correct floating-point division
        sum += (float)i / fact(i); 
    }

    printf("Sum: %f\n", sum); // Print the sum with a label
    return 0;
}
