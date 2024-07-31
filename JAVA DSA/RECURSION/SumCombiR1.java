//Combination sum-1 (Sum of subsequences should not repeat)

package RECURSION;

import java.util.ArrayList;
import java.util.HashSet;


public class SumCombiR1 {

    static HashSet<ArrayList<Integer>> method(int ind,int[]arr,ArrayList<Integer>al,HashSet<ArrayList<Integer>>set,int len){
        if(ind==len){
            set.add(new ArrayList<>(al));
            return set;
        }

        al.add(arr[ind]);
        method(ind+1,arr,al,set,len);
        al.remove(al.size()-1);
        method(ind+1,arr,al,set,len);

        return set;
    }
    

    public static void main(String[] args) {
        int[]arr={1,2,2};
        int len=arr.length;
        
        ArrayList<Integer>al=new ArrayList<>();
        HashSet<ArrayList<Integer>>set=new HashSet<>();
        HashSet<ArrayList<Integer>>set2=new HashSet<>();

        set2=method(0,arr,al,set,len);

        System.out.println(set2);
    }
}
