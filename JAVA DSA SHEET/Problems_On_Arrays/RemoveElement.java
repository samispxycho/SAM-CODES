package Problems_On_Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length-1;
        int count=0;
        while(start<=end){
            if(nums[end] == val){
                end-=1;
            }else{
                count+=1;
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4};
        int val = 3;
        int newLength = removeElement(nums, val);
        System.out.println("New Length: " + newLength);
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i] + " ");
        }
    }
}