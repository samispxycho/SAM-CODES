//Sum of subsequences in increasing order

package RECURSION;
import java.util.ArrayList;

public class SubseQueR6 {

    static ArrayList<Integer> method(int ind,int[]arr,ArrayList<Integer>al,ArrayList<Integer>a2,int len){
        if(ind==len){
            int sum=0;
            for(int ele:al){
                sum+=ele;
            }
            a2.add(sum);
            return a2;
        }

        al.add(arr[ind]);
        method(ind+1,arr,al,a2,len);
        al.remove(al.size()-1);
        method(ind+1,arr,al,a2,len);

        return a2;
    }

    public static void main(String[] args) {
        int[]arr={3,1,2};
        int len=arr.length;

        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<Integer>a2=new ArrayList<>();

        ArrayList<Integer>a3=new ArrayList<>();


        a3=method(0,arr,al,a2,len);
        a3.sort(null);
        System.out.println(a3);
        

    }
}
