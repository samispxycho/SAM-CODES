package ARRAY;

public class MaxSubArray {
    public static void main(String[] args) {
        
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};

        /*
        //Brute Force Method
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum > max)max=sum;
            }
        }
        System.out.println(max);
        */

        //Optimal solution (Kadane's algorithm)
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele:arr){
            sum+=ele;
            if(sum > max)max = sum;
            if(sum < 0) sum=0;
        }
        System.out.println(max);
        //algo says ki agar currentsum ki value < 0, change it to 0 kyuki usme operation krna is no use as harr baar value or kam hojayegi
    }
}
