package Problems_On_Arrays;
import java.lang.Math;

public class Longest_Subarray_k {
    public static void main(String[] args) {
        
        //only valid for array with positives or zeros

        int arr[]={1,2,3,1,1,1,1,3,3};

        int left=0;
        int right=0;
        int sum=arr[0];
        int len=0;

        while(right<arr.length){

            while(left<=right && sum>6){
                sum-=arr[left];
                left++;
            }

            if(sum==6){
                len=Math.max(len, right-left+1);
            }

            right++;
            if(right<arr.length) sum+=arr[right];

        }

        System.out.println("Length of longest subarray with sum 6 is: "+len);

    }
}
