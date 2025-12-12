package Problems_On_Arrays;

public class MaxConsiOnes {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int result = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 1, 1, 0, 1};
        int k = 2;

        int ans = longestOnes(nums, k);
        System.out.println("Max consecutive ones after flipping at most " + k + " zeros: " + ans);
    }
}