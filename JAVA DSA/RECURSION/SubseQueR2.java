//print the subsequences who sum is equal to target

package RECURSION;

import java.util.ArrayList;

public class SubseQueR2 {

    static void method(int ind,int[]arr,ArrayList<Integer>al,int len,int target){

        if(ind==len){

            int sum=0;
            for(int ele:al){
                sum+=ele;
            }
            if(sum==target){
                System.out.println(al);
            }
            return;
        }

        al.add(arr[ind]);
        method(ind+1,arr,al,len,target);
        al.remove(al.size()-1);
        method(ind+1,arr,al,len,target);
    }

    public static void main(String[] args) {
        
        int[]arr={1,2,1};
        int len=arr.length;
        ArrayList<Integer>al=new ArrayList<>();

        method(0,arr,al,len,2);
    }
}
