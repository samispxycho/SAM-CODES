package Problems_On_Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                count+=1;
                i+=1;
                nums[i] = nums[j];
            }
            j+=1;
        }
        return count+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};
        int newLength = removeDuplicates(nums);
        System.out.println("New Length: " + newLength);
        for(int k=0; k<newLength; k++){
            System.out.print(nums[k] + " ");
        }
    }
}