package Greedy_Algorithms;

public class JumpGame2 {
    public static int jump(int[] nums) {
        int jumps=0;
        int farthest=0;
        int currMax=0;

        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max(farthest,nums[i]+i);
            if(currMax == i){
                jumps+=1;
                currMax=farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
