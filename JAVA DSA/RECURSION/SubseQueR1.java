//Print all subsequences

package RECURSION;

import java.util.ArrayList;

public class SubseQueR1 {

    static void method(int ind,int[]arr,ArrayList<Integer>al,int len){
        if(ind==len){
            System.out.println(al);
            return;
        }

        al.add(arr[ind]);
        method(ind+1,arr,al,len);
        al.remove(al.size()-1);
        method(ind+1,arr,al,len);
    }

    public static void main(String[] args) {

        int[] arr={3,1,2};
        int len=arr.length;
        ArrayList<Integer>al=new ArrayList<>();

        method(0,arr,al,len);

    }
}
