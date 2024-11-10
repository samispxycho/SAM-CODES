package Basic_Recursion;

public class ReverseArray {

    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    static void reverseArray(int[]arr,int start,int end){
        if(start>=end){
            return;
        }else{
            swap(arr,start,end);
            reverseArray(arr, start+1, end-1);
        }
    }

    public static void main(String[] args) {
        
        int[]arr={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;

        reverseArray(arr,start,end);

        /*
        while(start<end){
            swap(arr,start,end);
            start++;end--;
        }
        */

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        

    }
}
