package Problems_On_Arrays;

public class MaxSumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > result) result = sum;
            if(sum < 0) sum = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        MaxSumSubarray obj = new MaxSumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(nums));
    }
}

//Algorithm is known as Kadane's algorithm for the largest subarray sum