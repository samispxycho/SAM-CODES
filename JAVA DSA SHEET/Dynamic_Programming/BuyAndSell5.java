package Dynamic_Programming;

public class BuyAndSell5 {

    // Memoization way
    public static int maxProfitMemo(int[] prices) {
        Integer dp[][] = new Integer[prices.length + 1][2];
        return solveMemo(prices, 0, 1, dp);
    }

    static int solveMemo(int[] prices, int index, int able, Integer dp[][]) {
        if (index >= prices.length) return 0;

        if (dp[index][able] != null) return dp[index][able];

        int profit = 0;

        if (able == 1) {
            int buy = -prices[index] + solveMemo(prices, index + 1, 0, dp);
            int skip = solveMemo(prices, index + 1, 1, dp);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] + solveMemo(prices, index + 2, 1, dp);
            int skip = solveMemo(prices, index + 1, 0, dp);
            profit = Math.max(sell, skip);
        }

        return dp[index][able] = profit;
    }

    /*
    Classic recursion way
    public static int maxProfitRec(int[] prices) {
        return solveRec(prices, 0, 1);
    }

    static int solveRec(int[] prices, int index, int able) {
        if (index >= prices.length) return 0;
        int profit = 0;

        if (able == 1) {
            int buy = -prices[index] + solveRec(prices, index + 1, 0);
            int skip = solveRec(prices, index + 1, 1);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[index] + solveRec(prices, index + 2, 1);
            int skip = solveRec(prices, index + 1, 0);
            profit = Math.max(sell, skip);
        }

        return profit;
    }
    */

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(maxProfitMemo(prices)); 

        //System.out.println(maxProfitRec(prices));  // for classic recursion way
    }
}