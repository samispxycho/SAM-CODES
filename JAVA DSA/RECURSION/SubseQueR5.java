//Sum is equal to target--2nd way

package RECURSION;

import java.util.ArrayList;

public class SubseQueR5 {

    static void method(int ind,int[]arr,ArrayList<Integer>al,int len,int target){
        if(ind==len){
            if(target==0){
                System.out.println(al);
            }
            return;
        }

        al.add(arr[ind]);
        method(ind+1,arr,al,len,target-arr[ind]);
        al.remove(al.size()-1);
        method(ind+1,arr,al,len,target);

    }

    public static void main(String[] args) {
        int[]arr={1,2,1};
        ArrayList<Integer>al=new ArrayList<>();
        int len=arr.length;

        method(0,arr,al,len,2);
    }
}
