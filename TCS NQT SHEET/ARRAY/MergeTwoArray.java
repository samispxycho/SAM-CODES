package ARRAY;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[]arr1 = {1,3,5,7};  //first array
        int[]arr2={0,2,6,8,9};  //second array

        int m = arr1.length;
        int n = arr2.length;

        /* Brute Force Approach (By creating an extra array)
        int[]arr3=new int[m+n];     //creating a third array
        int left = 0;               //for first array
        int right = 0;              //for second array
        int index = 0;              //for third array

        //jab tak dono array mai elements hai
        while(left < m && right < n){
            if(arr1[left] < arr2[right]){
                arr3[index++] = arr1[left++];
            }
            else{
                arr3[index++] = arr2[right++];
            }
        }

        //agar right array mai khatam hogye
        while(left < m){
            arr3[index++] = arr1[left++];
        }

        //agar left array mai khtm hogye
        while(right < n){
            arr3[index++] = arr2[right++];
        }

        //dono array ki values change krne ke liye to sorted order
        for(int i=0;i<arr3.length;i++){
            if(i < m)arr1[i]=arr3[i];
            else arr2[i-m] = arr3[i];
        }   //we can also directly print the third array

        //printing both arrays
        for(int ele: arr1){
            System.out.print(ele+" ");
        }
        System.out.print("     ");
        for(int ele:arr2){
            System.out.print(ele+" ");
        }
        */

        //Better approach
        int left = m-1;
        int right = 0;

        while(left >= 0 && right < n){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--;right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int ele: arr1){
            System.out.print(ele+" ");
        }
        System.out.print("     ");
        for(int ele:arr2){
            System.out.print(ele+" ");
        }

    }
}
