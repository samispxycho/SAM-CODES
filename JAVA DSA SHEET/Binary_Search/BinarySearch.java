package Binary_Search;

public class BinarySearch {

    // Recursive way
    public static int searchRec(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    static int binarySearch(int nums[], int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, high, target);
        } else {
            return binarySearch(nums, low, mid - 1, target);
        }
    }

    /*
    Iterative way
    public static int searchIter(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    */

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(searchRec(nums, target));

        //System.out.println(searchIter(nums, target));  // for iterative way
    }
}
