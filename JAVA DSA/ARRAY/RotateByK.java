package ARRAY;

public class RotateByK {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 2;
        int len = arr.length;

        for (int j = 1; j <= k; j++) {

            int last = arr[len - 1];

            for (int i = len - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        for (int ele : arr)
            System.out.print(ele + " ");
    }
}

