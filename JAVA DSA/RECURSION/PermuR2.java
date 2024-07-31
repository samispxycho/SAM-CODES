package RECURSION;

import java.util.List;
import java.util.ArrayList;

public class PermuR2 {

    static void method(int ind,int[]arr){
        if(ind==arr.length){
            List<Integer>al=new ArrayList<>();

            for(int ele:arr){
                al.add(ele);
            }

            System.out.println(al);
            return;
        }

        for(int i=ind;i<arr.length;i++){
            swap(i,ind,arr);
            method(ind+1,arr);
            swap(i,ind,arr);
        }
    }

    static void swap(int i,int ind,int[]arr){
        int t=arr[i];
        arr[i]=arr[ind];
        arr[ind]=t;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3};
        method(0,arr);

    }
}
