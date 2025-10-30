package Binary_Search;

public class MinimumRotatedSA {

    public int findMin(int[] nums) {
       
        int low = 0;
        int high = nums.length - 1;
        int result = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] <= result) result = nums[mid];

            if(nums[low] <= nums[mid]){
                result = Math.min(result, nums[low]);
                low = mid + 1;
            }else{
                result = Math.min(result, nums[mid]);
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        MinimumRotatedSA obj = new MinimumRotatedSA();
        int result = obj.findMin(nums);

        System.out.println("Minimum element: " + result);
    }
}