package Dynamic_Programming;
import java.util.Arrays;

public class HouseRobber2 {

    // Memoization way
    public static int robMemo(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        Integer arr[] = new Integer[101];
        int take0thHouse = solveMemo(nums, 0, n - 2, arr);

        Arrays.fill(arr, null);
        int skip0thHouse = solveMemo(nums, 1, n - 1, arr);

        return Math.max(take0thHouse, skip0thHouse);
    }

    static int solveMemo(int nums[], int i, int n, Integer arr[]) {
        if (i > n) return 0;
        if (arr[i] != null) return arr[i];
        int steal = nums[i] + solveMemo(nums, i + 2, n, arr);
        int skip = solveMemo(nums, i + 1, n, arr);
        return arr[i] = Math.max(steal, skip);
    }

    /*
    Classic recursion way
    public static int robRec(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int take0thHouse = solveRec(nums, 0, n - 2);
        int skip0thHouse = solveRec(nums, 1, n - 1);

        return Math.max(take0thHouse, skip0thHouse);
    }

    static int solveRec(int nums[], int i, int n) {
        if (i > n) return 0;
        int steal = nums[i] + solveRec(nums, i + 2, n);
        int skip = solveRec(nums, i + 1, n);
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
