package Problems_On_Arrays;

public class Single_Number {
    public static void main(String[] args) {

        int[]arr={3,2,2,1,3,1,5};
        int result=0;

        for(int ele:arr){
            result = result ^ ele;
        }

        System.out.println("Element that appear once is: "+result);

    }
}
