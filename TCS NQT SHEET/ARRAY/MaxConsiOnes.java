package ARRAY;

public class MaxConsiOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,0,1,1,1};
        int max = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count = 0;
            }else{
                count++;
            }
            if(count > max)max=count;
        }
        System.out.println(max);
    }
}
