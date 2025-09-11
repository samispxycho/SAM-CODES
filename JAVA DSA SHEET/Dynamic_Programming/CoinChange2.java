package Dynamic_Programming;

public class CoinChange2 {

    // Memoization way
    static int changeMemo(int amount, int[] coins) {
        Integer[][] arr = new Integer[coins.length + 1][amount + 1];
        return solve(coins, amount, 0, arr);
    }

    static int solve(int[] coins, int amount, int i, Integer[][] arr) {
        if (amount == 0) return 1;
        if (i >= coins.length) return 0;
        if (coins[i] > amount) return solve(coins, amount, i + 1, arr);

        if (arr[i][amount] != null) return arr[i][amount];

        int take = solve(coins, amount - coins[i], i, arr);
        int skip = solve(coins, amount, i + 1, arr);

        return arr[i][amount] = take + skip;
    }

    /*
    // Recursive way
    static int changeRecursive(int amount, int[] coins) {
        return solve(coins, amount, 0);
    }

    static int solve(int[] coins, int amount, int i) {
        if (amount == 0) return 1;
        if (i >= coins.length) return 0;
        if (coins[i] > amount) return solve(coins, amount, i + 1);

        int take = solve(coins, amount - coins[i], i);
        int skip = solve(coins, amount, i + 1);

        return take + skip;
    }
    */

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;

        int result = changeMemo(amount, coins);
        System.out.println(result);

        // System.out.println(changeRecursive(amount, coins));   // for recursive way
    }
}