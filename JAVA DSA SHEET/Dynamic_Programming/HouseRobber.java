package Dynamic_Programming;

public class HouseRobber {

    // Memoization way
    public static int robMemo(int[] nums) {
        Integer arr[] = new Integer[101];
        return solve(nums, arr, 0);
    }

    static int solve(int nums[], Integer arr[], int i) {
        if (i >= nums.length) return 0;
        if (arr[i] != null) return arr[i];
        int steal = nums[i] + solve(nums, arr, i + 2);
        int skip = solve(nums, arr, i + 1);
        return arr[i] = Math.max(steal, skip);
    }

    /*
    Classic recursion way
    public static int robRec(int[] nums) {
        return solveRec(nums, 0);
    }

    static int solveRec(int nums[], int i) {
        if (i >= nums.length) return 0;
        int steal = nums[i] + solveRec(nums, i + 2);
        int skip = solveRec(nums, i + 1);
        return Math.max(steal, skip);
    }
    */

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int result = robMemo(nums);
        System.out.println(result);

        //System.out.println(robRec(nums));   for classic recursive way
    }
}
