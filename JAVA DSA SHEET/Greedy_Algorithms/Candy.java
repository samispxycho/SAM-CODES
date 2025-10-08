package Greedy_Algorithms;

public class Candy {

    /*
    // Brute Force Approach
    public static int candyBruteForce(int[] ratings) {
        int n = ratings.length;

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.max(left[i], right[i]);
        }

        return sum;
    }
    */

    // Optimal Approach
    public static int candyOptimal(int[] ratings) {
        int n = ratings.length;
        if (n == 0) return 0;
        int candy = n;
        int i = 1;

        while (i < n) {
            int peak = 0;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                candy += peak;
                i++;
            }

            int dip = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                dip++;
                candy += dip;
                i++;
            }

            candy -= Math.min(peak, dip);

            if (peak == 0 && dip == 0) i++;
        }
        return candy;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        int result = candyOptimal(ratings);
        System.out.println(result);

        // System.out.println(candyBruteForce(ratings)); // Uncomment to test brute force
    }
}