package RECURSION;

public class ReverseArray1R {

    static void reverseArray(int[]arr,int s,int e){
        if(s>e)return;

        int temp;
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;

        reverseArray(arr, s+1, e-1);

    }

    static void reverseArray2(int[]arr,int n,int i){
        if(i>n/2)return;
        

        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        reverseArray2(arr,n,i+1);
    }
    

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]arr2={6,7,8,9,10};

        reverseArray(arr, 0, arr.length-1);
        reverseArray2(arr2, arr2.length, 0);

        for(int ele:arr){
            System.out.print(ele+" ");
        }

        for(int ele:arr2){
            System.out.print(ele+" ");
        }
        
        
    }
}
