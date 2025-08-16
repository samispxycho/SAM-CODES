package Problems_On_Arrays;

public class MaxSubarrayReturn {

    public void SubArray(int[] arr) {

        int sum = 0;
        int result = Integer.MIN_VALUE;

        int start=0;
        int end=0;
        int temp=0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(sum > result){
                result = sum;
                start = temp;
                end = i;
            }

            if(sum < 0){
                sum = 0;
                temp = i + 1;
            }
        }

        for(int i=start;i<=end;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n" + result);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        MaxSubarrayReturn obj = new MaxSubarrayReturn();
        obj.SubArray(arr);
    }
}
