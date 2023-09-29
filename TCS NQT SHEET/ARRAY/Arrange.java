package ARRAY;

public class Arrange {

    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {3,5,1,2,4};

        //Ascending order
        for(int i = arr.length-1 ; i>0 ;i--){
            for(int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(int ele:arr)System.out.print(ele+" ");
        System.out.println();

        for(int i = arr.length-1;i>0;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j] < arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(int ele:arr)System.out.print(ele+" ");


    }
}
