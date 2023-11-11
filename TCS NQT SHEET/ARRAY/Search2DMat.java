package ARRAY;

public class Search2DMat {

    public static boolean LSearch(int[]arr,int target){
        
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target)return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][]arr={{1,3,5,7},{9,11,15,19},{21,25,27,32}};
        int target = 27;

        //Optimal
        int n=arr.length;
        int m=arr[0].length;
        int flag=0;

        for(int i=0;i<n;i++){
            if(arr[i][0]<target && arr[i][m-1]>target){
                System.out.println(LSearch(arr[i], target));
                flag=1;
            }
        }
        if(flag==0)System.out.println(false);
        
    }
}


/*
    //Brute Force
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j] == target){
                System.out.println(true);
            }
        }
    }
*/
