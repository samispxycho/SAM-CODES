package ARRAY;

public class ReverseArray {

    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        
        int [] arr={5,4,3,2,1};
        int start=0;
        int end=arr.length - 1;

        while(start < end){
            swap(arr,start,end);
            start++;end--;
        }

        for(int ele:arr)System.out.print(ele+" ");

    }
}
