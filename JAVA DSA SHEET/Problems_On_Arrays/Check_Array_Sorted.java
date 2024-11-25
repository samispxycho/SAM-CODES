package Problems_On_Arrays;

public class Check_Array_Sorted {
    public static void main(String[] args) {
        
        int[]arr={5,6,8,10,12,7};
        
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
        }

        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        if(count<=1){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is unsorted");
        }

    }
}
