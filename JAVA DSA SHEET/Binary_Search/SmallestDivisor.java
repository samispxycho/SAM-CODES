package Binary_Search;

public class SmallestDivisor {

    int findMax(int nums[]){
        int max = 0;
        for(int ele : nums){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

    int findSum(int nums[],int mid){
        int calSum = 0;
        for(int ele : nums){
            if(ele % mid == 0){
                calSum += (ele / mid);
            }else{
                calSum += (ele / mid) + 1;
            }
        }
        return calSum;
    }

    int search(int nums[],int threshold){
        int low = 1;
        int high = findMax(nums);
        while(low <= high){
            int mid = (low + high)/2;
            int calcSum = findSum(nums,mid);
            if(calcSum <= threshold){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        return search(nums, threshold);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        SmallestDivisor obj = new SmallestDivisor();
        int result = obj.smallestDivisor(nums, threshold);

        System.out.println("Smallest Divisor: " + result);
    }
}