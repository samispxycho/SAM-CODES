//print all possible permutation-approach 1
package RECURSION;
import java.util.ArrayList;
import java.util.List;

public class PermuR1 {

    static void method(int[]arr,List<Integer>al,boolean[]freq){
        if(al.size()==3){
            System.out.println(al);
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                al.add(arr[i]);
                method(arr,al,freq);
                al.remove(al.size()-1);
                freq[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3};
        List<Integer>al=new ArrayList<>();
        boolean[]freq=new boolean[arr.length];

        method(arr,al,freq);
    }
}
