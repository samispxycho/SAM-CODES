package ARRAY;

public class MinMax {
    public static void main(String[] args) {
        int[] arr={4,2,9,7,3,6,1,5,8};
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int ele : arr)
        {
            if(ele > max) max = ele;
            if(ele < min)min = ele;
        }
        System.out.println("Max value is: "+max);
        System.out.println("Min value is: "+ min);

    }
}
