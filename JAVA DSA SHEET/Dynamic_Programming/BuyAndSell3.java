package Dynamic_Programming;

public class BuyAndSell3 {

    // Memoization way
    public static int maxProfitMemo(int[] prices) {
        Integer dp[][][] = new Integer[prices.length + 1][2][3];
        return solveMemo(prices, 0, 1, 2, dp);
    }

    static int solveMemo(int[] prices, int index, int able, int bound, Integer dp[][][]) {
        if (index == prices.length) return 0;
        if (bound == 0) return 0;

        if (dp[index][able][bound] != null) return dp[index][able][bound];

        int profit = 0;

        if (able == 1) {
            int buy = -prices[index] + solveMemo(prices, index + 1, 0, bound, dp);
            int skip = solveMemo(prices, index + 1, 1, bound, dp);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] + solveMemo(prices, index + 1, 1, bound - 1, dp);
            int skip = solveMemo(prices, index + 1, 0, bound, dp);
            profit = Math.max(sell, skip);
        }

        return dp[index][able][bound] = profit;
    }

    /*
    Classic recursion way
    public static int maxProfitRec(int[] prices) {
        return solveRec(prices, 0, 1, 2);
    }

    static int solveRec(int[] prices, int index, int able, int bound) {
        if (index == prices.length) return 0;
        if (bound == 0) return 0;

        int profit = 0;

        if (able == 1) {
            int buy = -prices[index] + solveRec(prices, index + 1, 0, bound);
            int skip = solveRec(prices, index + 1, 1, bound);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] + solveRec(prices, index + 1, 1, bound - 1);
            int skip = solveRec(prices, index + 1, 0, bound);
            profit = Math.max(sell, skip);
        }

        return profit;
    }
    */

    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};

        int result = maxProfitMemo(prices);
        System.out.println("Maximum Profit: " + result);

        // System.out.println(maxProfitRec(prices));  for classic recursive way
    }
}