package RECURSION;

public class ReverseArray1 {

    //Using two pointers
    static void ra(int[]arr,int i,int j){
        if(i>=j)return;

        else{
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        ra(arr,i+1,j-1);
    }



    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        
        int first_index=0;
        int last_index=arr.length-1;

        ReverseArray1.ra(arr,first_index,last_index);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
