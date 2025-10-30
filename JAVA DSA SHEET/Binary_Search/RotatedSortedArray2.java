package Binary_Search;

public class RotatedSortedArray2 {

    public boolean search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return true;

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low = low + 1;
                high = high -1;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid - 1;
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
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        RotatedSortedArray2 obj = new RotatedSortedArray2();
        boolean result = obj.search(nums, target);

        System.out.println("Target found: " + result);
    }
}