package Binary_Search;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        SearchInsert obj = new SearchInsert();
        int result = obj.searchInsert(nums, target);

        System.out.println("Insert position: " + result);
    }
}