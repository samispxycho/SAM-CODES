//Count the number of subsequences

package RECURSION;

import java.util.ArrayList;

public class SubseQueR3 {

    static int method(int ind,int[]arr,ArrayList<Integer>al,int len){
        if(ind==len){
            return 1;
        }

        al.add(arr[ind]);
        int take=method(ind+1,arr,al,len);
        al.remove(al.size()-1);
        int not_take=method(ind+1,arr,al,len);

        return take+not_take;
    }

    public static void main(String[] args) {
        
        int[]arr={3,1,2};
        int len=arr.length;
        ArrayList<Integer>al=new ArrayList<>();

        int total=method(0,arr,al,len);
        System.out.println("Total subsequences: "+total);

    }
}
