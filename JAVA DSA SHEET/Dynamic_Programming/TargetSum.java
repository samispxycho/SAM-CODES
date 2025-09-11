package Dynamic_Programming;

import java.util.*;

public class TargetSum {

    // Memoization way
    static Map<String, Integer> dp;

    static int findTargetSumWays(int[] nums, int target) {
        dp = new HashMap<>();
        return solve(nums, target, 0, 0);
    }

    static int solve(int[] nums, int target, int i, int sum) {
        if (i == nums.length) {
            return target == sum ? 1 : 0;
        }

        String key = i + "_" + sum;
        if (dp.containsKey(key)) return dp.get(key);

        int add = solve(nums, target, i + 1, sum + nums[i]);
        int sub = solve(nums, target, i + 1, sum - nums[i]);

        dp.put(key, add + sub);
        return dp.get(key);
    }

    /*
    // Recursive way
    static int findTargetSumWaysRecursive(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    static int solve(int[] nums, int target, int i, int sum) {
        if (i == nums.length) {
            return target == sum ? 1 : 0;
        }

        int add = solve(nums, target, i + 1, sum + nums[i]);
        int sub = solve(nums, target, i + 1, sum - nums[i]);

        return add + sub;
    }
    */

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;

        int result = findTargetSumWays(nums, target);
        System.out.println(result);

        // System.out.println(findTargetSumWaysRecursive(nums, target)); // for recursive way
    }
}