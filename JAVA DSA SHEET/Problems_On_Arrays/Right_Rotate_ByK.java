package Problems_On_Arrays;

public class Right_Rotate_ByK {

    static void reverse(int[]arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};
        int k=3;

        int len=arr.length;
        k=k%len;

        reverse(arr,0,len-1);
        reverse(arr,0,k-1);
        reverse(arr,k,len-1);

        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
