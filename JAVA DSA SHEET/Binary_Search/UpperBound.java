package Binary_Search;

public class UpperBound {
    int upperBound(int[] arr, int target) {

        int ans = arr.length;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 7};
        int target = 4;

        UpperBound obj = new UpperBound();
        int result = obj.upperBound(arr, target);

        System.out.println("Upper bound index: " + result);
    }

}
