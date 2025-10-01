package Dynamic_Programming;

public class IncreasingSubse {

    // Memoization way
    public static int lengthOfLISMemo(int[] nums) {
        Integer dp[][] = new Integer[nums.length][nums.length];
        return solveMemo(nums, 0, -1, dp);
    }

    static int solveMemo(int[] nums, int i, int p, Integer dp[][]) {
        if (i == nums.length) return 0;

        if (dp[i][p + 1] != null) return dp[i][p + 1];

        int take = 0;
        if (p == -1 || nums[p] < nums[i]) {
            take = 1 + solveMemo(nums, i + 1, i, dp);
        }

        int skip = solveMemo(nums, i + 1, p, dp);

        return dp[i][p + 1] = Math.max(take, skip);
    }

    /*
    // Classic recursion way
    public static int lengthOfLISRec(int[] nums) {
        return solveRec(nums, 0, -1);
    }

    static int solveRec(int[] nums, int i, int p) {
        if (i == nums.length) return 0;

        int take = 0;
        if (p == -1 || nums[p] < nums[i]) {
            take = 1 + solveRec(nums, i + 1, i);
        }

        int skip = solveRec(nums, i + 1, p);

        return Math.max(take, skip);
    }
    */

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lengthOfLISMemo(nums);
        System.out.println(result); // Expected output: 4

        //System.out.println(lengthOfLISRec(nums)); // for classic recursive way
    }
}