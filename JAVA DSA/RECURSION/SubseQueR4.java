//print only 1 of the subsequences without using global variable

package RECURSION;

import java.util.ArrayList;

public class SubseQueR4 {

    static boolean method(int ind,int[]arr,ArrayList<Integer>al,int len){

        if(ind==len){
            System.out.println(al);
            return true;
        }

        al.add(arr[ind]);
        if(method(ind+1,arr,al,len)==true)return true;
        al.remove(al.size()-1);
        if(method(ind+1,arr,al,len)==true)return true;

        return false;
    }

    public static void main(String[] args) {

        int[]arr={3,1,2};
        int len=arr.length;
        ArrayList<Integer>al=new ArrayList<>();

        method(0,arr,al,len);

    }
}
