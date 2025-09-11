package Dynamic_Programming;

public class EqualSubsetSum {

    // Memoization way
    public static boolean canPartitionMemo(int[] nums) {
        int sum = 0;
        for (int ele : nums) sum += ele;

        if (sum % 2 != 0) return false;

        int x = sum / 2;
        Boolean dp[][] = new Boolean[nums.length][x + 1];
        return solveMemo(nums, x, 0, dp);
    }

    static boolean solveMemo(int nums[], int x, int i, Boolean dp[][]) {
        if (x == 0) return true;
        if (i >= nums.length) return false;
        if (dp[i][x] != null) return dp[i][x];

        boolean take = false;
        if (x >= nums[i]) {
            take = solveMemo(nums, x - nums[i], i + 1, dp);
        }
        boolean notTake = solveMemo(nums, x, i + 1, dp);

        return dp[i][x] = take || notTake;
    }

    /*
    Classic recursion way
    public static boolean canPartitionRec(int[] nums) {
        int sum = 0;
        for (int ele : nums) sum += ele;

        if (sum % 2 != 0) return false;

        int x = sum / 2;
        return solveRec(nums, x, 0);
    }

    static boolean solveRec(int nums[], int x, int i) {
        if (x == 0) return true;
        if (i >= nums.length) return false;

        boolean take = false;
        if (x >= nums[i]) {
            take = solveRec(nums, x - nums[i], i + 1);
        }
        boolean notTake = solveRec(nums, x, i + 1);

        return take || notTake;
    }
    */

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};

        boolean result = canPartitionMemo(nums);
        System.out.println(result);

        //System.out.println(canPartitionRec(nums));   for classic recursive way
    }
}