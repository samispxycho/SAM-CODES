package Problems_On_Arrays;

public class Second_Largest_ele {
    public static void main(String[] args) {
        
        int[]arr={1,2,4,7,7,5};
        
        // int largest=arr[0];
        // int i=0;
        
        // while(i<arr.length){
        //     if(largest<arr[i])largest=arr[i];
        //     i++;
        // }

        // int s_largest=-1;
        // i=0;
        // while(i<arr.length){
        //     if(s_largest<arr[i] && arr[i]!=largest){
        //         s_largest=arr[i];
        //     }
        //     i++;
        // }
        // System.out.println(s_largest);


        //optimal
        int largest=arr[0];
        int s_largest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                s_largest=largest;
                largest=arr[i];
            }
            if(arr[i]>s_largest && arr[i]<largest){
                s_largest=arr[i];
            }
        }
        System.out.println("Second largest element is: "+s_largest);

    }
}
