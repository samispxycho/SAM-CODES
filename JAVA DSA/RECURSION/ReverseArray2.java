package RECURSION;

public class ReverseArray2 {

    static void ra2(int[]arr,int i){
        int len=arr.length;

        if(i>=len/2)return;
        else{
            int temp=arr[i];
            arr[i]=arr[len-i-1]; 
            arr[len-i-1]=temp;
        }
        ra2(arr,i+1);

    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int first=0;

        ReverseArray2.ra2(arr,first);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
