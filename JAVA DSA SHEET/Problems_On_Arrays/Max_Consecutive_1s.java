package Problems_On_Arrays;

public class Max_Consecutive_1s {
    public static void main(String[] args) {
        int[]arr={0,1,1,0,0,1,1,1,1,1,0,1,0};
        int max=0;
        int count=0;
        for(int ele:arr){
            if(ele==0){
                count=0;
            }else{
                count++;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println("Maximum consecutive ones are: "+max);
    }
}
