package ARRAY;

public class ElementNBy2 {
    public static void main(String[] args) {
       
        int[] arr = { 3, 4, 3, 3, 3, 4, 3, 3, 7, 9, 3, 7, 3, 3, 5, 9, 8, 3, 3 };

        int ele = 0;
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = arr[i];
                count = 1;
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        int counter=0;
        for(int el:arr){
            if(el==ele)counter++;
        }

        if(counter > (n/2)){
            System.out.println(ele);
        }else{
            System.out.println(-1);
        }

    }
}
