package Problems_On_Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        
        int[]arr={1,0,2,3,0,0,4};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)continue;
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
