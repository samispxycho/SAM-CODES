package Binary_Search;

public class SearchRange {

    int lowerBound(int nums[], int low, int high, int target){
        int ans = nums.length;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    int upperBound(int nums[], int low, int high, int target){
        int ans = nums.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] > target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        
        int lb = lowerBound(nums, 0, n-1, target);
        if(lb == n || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        int up = upperBound(nums, 0, n-1, target);

        return new int[]{lb,up-1};
        
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        SearchRange obj = new SearchRange();
        int[] result = obj.searchRange(nums, target);

        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }
}