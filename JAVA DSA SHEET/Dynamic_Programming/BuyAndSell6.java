package Dynamic_Programming;

public class BuyAndSell6 {

    // Memoization way
    public static int maxProfitMemo(int[] prices, int fee) {
        Integer dp[][] = new Integer[prices.length + 1][2];
        return solveMemo(prices, 0, 1, fee, dp);
    }

    static int solveMemo(int[] prices, int index, int able, int fee, Integer dp[][]) {
        if (index == prices.length) return 0;
        if (dp[index][able] != null) return dp[index][able];

        int profit = 0;

        if (able == 1) {
            int buy = -prices[index] + solveMemo(prices, index + 1, 0, fee, dp);
            int skip = solveMemo(prices, index + 1, 1, fee, dp);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] - fee + solveMemo(prices, index + 1, 1, fee, dp);
            int skip = solveMemo(prices, index + 1, 0, fee, dp);
            profit = Math.max(sell, skip);
        }

        return dp[index][able] = profit;
    }

    /*
    Classic recursion way
    public static int maxProfitRec(int[] prices, int fee) {
        return solveRec(prices, 0, 1, fee);
    }

    static int solveRec(int[] prices, int index, int able, int fee) {
        if (index == prices.length) return 0;

        int profit = 0;

        if (able == 1) {
            int buy = -prices[index] + solveRec(prices, index + 1, 0, fee);
            int skip = solveRec(prices, index + 1, 1, fee);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] - fee + solveRec(prices, index + 1, 1, fee);
            int skip = solveRec(prices, index + 1, 0, fee);
            profit = Math.max(sell, skip);
        }

        return profit;
    }
    */

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;

        System.out.println(maxProfitMemo(prices, fee));

        // System.out.println(maxProfitRec(prices, fee)); // for classic recursion way
    }
}