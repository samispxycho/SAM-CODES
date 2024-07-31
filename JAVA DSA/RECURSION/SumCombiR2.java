//Combination sum 2-Sum of subsequences equals to target

package RECURSION;

import java.util.ArrayList;

public class SumCombiR2 {

    static ArrayList<ArrayList<Integer>> method(int ind, int[] arr, ArrayList<Integer> al,
            ArrayList<ArrayList<Integer>> al2, int len, int target) {
        if (ind == len) {
            if (target == 0) {
                al2.add(new ArrayList<>(al));
            }
            return al2;
        }

        al.add(arr[ind]);
        method(ind + 1, arr, al, al2, len, target - arr[ind]);
        al.remove(al.size() - 1);

        method(ind + 1, arr, al, al2, len, target);

        return al2;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 4, 1};
        int len = arr.length;

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<ArrayList<Integer>> al2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> al3 = new ArrayList<>();

        al3 = method(0, arr, al, al2, len, 5);
        System.out.println(al3);

    }
}
