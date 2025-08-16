package Problems_On_Arrays;
import java.util.*;

public class ArrangeBySign2 {

    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer>p = new ArrayList<>();
        ArrayList<Integer>n = new ArrayList<>();
        int len = nums.length;

        for(int ele:nums){
            if(ele>=0)p.add(ele);
            else n.add(ele);
        }

        int arr[] = new int[len];

        if(p.size() > n.size()){

            for(int i=0;i<n.size();i++){
                arr[2*i] = p.get(i);
                arr[2*i+1] = n.get(i);
            }

            int index = n.size()*2;
            for(int j=n.size(); j<p.size();j++){
                arr[index] = p.get(j);
                index+=1;
            }

        }
        else{

            for(int i=0;i<p.size();i++){
                arr[2*i] = p.get(i);
                arr[2*i+1] = n.get(i);
            }

            int index = p.size()*2;
            for(int j=p.size();j<n.size();j++){
                arr[index] = n.get(j);
                index++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4,20,30,40};
        ArrangeBySign2 obj = new ArrangeBySign2();
        int[] res = obj.rearrangeArray(nums);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
