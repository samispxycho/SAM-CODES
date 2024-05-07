package SORTING_ALGOS;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,1,9,7};
        
        for(int i=arr.length-1; i>=1;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    didswap = 1;
                }
            }
            if(didswap == 0) break;     //optimised for best case, in case all sorted
        }
        for(int ele:arr)System.out.print(ele + " ");

    }
}
