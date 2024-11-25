package Problems_On_Arrays;

public class Missing_Number {
    public static void main(String[] args) {

        int nums[]={1,2,3,4,5,6,7,8,10};

        /*
        Arrays.sort(arr);
        int total=0;
        int j=arr[arr.length-1];
        while(j>0){
            total=total+j;
            j--;
        }
        System.out.println(total);
        */

        int n=nums.length+1;
        int total=(n*(n+1))/2;

        int array_sum=0;
        for(int ele:nums){
            array_sum+=ele;
        }

        System.out.println("Missing term is: "+(total-array_sum));

    }
}
