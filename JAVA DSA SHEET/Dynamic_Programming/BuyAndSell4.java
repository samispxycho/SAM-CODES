package Dynamic_Programming;

public class BuyAndSell4 {

    // Memoization way
    public static int maxProfitMemo(int k, int[] prices) {
        Integer dp[][][] = new Integer[prices.length+1][2][k+1];
        return solveMemo(prices, 0, 1, k, dp);
    }

    static int solveMemo(int[] prices, int index, int able, int k, Integer dp[][][]) {
        if (index == prices.length) return 0;
        if (k == 0) return 0;
        if (dp[index][able][k] != null) return dp[index][able][k];

        int profit = 0;
        if (able == 1) {
            int buy = -prices[index] + solveMemo(prices, index+1, 0, k, dp);
            int skip = solveMemo(prices, index+1, 1, k, dp);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] + solveMemo(prices, index+1, 1, k-1, dp);
            int skip = solveMemo(prices, index+1, 0, k, dp);
            profit = Math.max(sell, skip);
        }
        return dp[index][able][k] = profit;
    }

    /*
    Classic recursion way
    public static int maxProfitRec(int k, int[] prices) {
        return solveRec(prices, 0, 1, k);
    }

    static int solveRec(int[] prices, int index, int able, int k) {
        if (index == prices.length) return 0;
        if (k == 0) return 0;

        int profit = 0;
        if (able == 1) {
            int buy = -prices[index] + solveRec(prices, index+1, 0, k);
            int skip = solveRec(prices, index+1, 1, k);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] + solveRec(prices, index+1, 1, k-1);
            int skip = solveRec(prices, index+1, 0, k);
            profit = Math.max(sell, skip);
        }
        return profit;
    }
    */

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int k = 2;

        int result = maxProfitMemo(k, prices);
        System.out.println(result);

        // System.out.println(maxProfitRec(k, prices));  // for classic recursive way
    }
}