package Problems_On_Arrays;

public class MinimumSizeSum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int ans = minSubArrayLen(target, nums);
        System.out.println(ans);
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;

        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum >= target){
                result = Math.min(result,j-i+1);
                sum-=nums[i];
                i+=1;
            }
        }

        if(result == Integer.MAX_VALUE){
            return 0;
        }

        return result;
    }
}
