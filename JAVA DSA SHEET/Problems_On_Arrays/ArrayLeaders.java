package Problems_On_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer>al=new ArrayList<>();
        int isLargest = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] >= isLargest){
                isLargest = arr[i];
                al.add(arr[i]);
            }
        }
        
        Collections.reverse(al);
        return al;
    }

    public static void main(String[] args) {

        ArrayList<Integer>al = new ArrayList<>();
        
        int arr[] = {16, 17, 4, 3, 5, 2};
        al = ArrayLeaders.leaders(arr);
        
        for(int ele:al)System.out.print(ele+" ");
    }
}
