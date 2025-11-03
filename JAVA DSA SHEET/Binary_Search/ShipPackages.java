package Binary_Search;

public class ShipPackages {

    static int findMax(int nums[]) {
        int max = 0;
        for (int ele : nums) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    static int findSum(int nums[]) {
        int sum = 0;
        for (int ele : nums) {
            sum += ele;
        }
        return sum;
    }

    static int countDays(int nums[], int mid) {
        int count = 1;
        int temp = 0;
        for (int ele : nums) {
            temp += ele;
            if (temp > mid) {
                count += 1;
                temp = ele;
            }
        }
        return count;
    }

    static int search(int nums[], int days) {
        int low = findMax(nums);
        int high = findSum(nums);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalDays = countDays(nums, mid);
            if (totalDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int shipWithinDays(int[] weights, int days) {
        return search(weights, days);
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;
        int result = shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity required: " + result);
    }
}