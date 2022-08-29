import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args) {
        int len, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to create: ");
        len = sc.nextInt();

        int[] arr = new int[len];

        for (i = 0; i < len; i++) // Asking user for elements
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in normal order");
        for (i = 0; i < len; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.printf("\n");

        System.out.println("Elements in reversed order");
        for (i = len - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
