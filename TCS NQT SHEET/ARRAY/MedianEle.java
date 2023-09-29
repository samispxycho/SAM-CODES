package ARRAY;
import java.util.Arrays;

public class MedianEle {
    public static void main(String[] args) {
        int[] arr={30,50,10,40,20,60};
        int len = arr.length;
        Arrays.sort(arr);

        if(len % 2 == 0){

            int i1 = arr[len/2];
            int i2 = arr[len/2-1];
            int e_med = (i1+i2)/2;

            System.out.println("Median is "+e_med);

        }else{
            System.out.println("Median is "+ arr[len/2]);
        }


    }
}
