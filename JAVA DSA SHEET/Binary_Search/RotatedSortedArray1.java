package Binary_Search;

public class RotatedSortedArray1 {

    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        RotatedSortedArray1 obj = new RotatedSortedArray1();
        int result = obj.search(nums, target);

        System.out.println("Target index: " + result);
    }
}