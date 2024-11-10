package Basic_Recursion;
import java.util.Scanner;

public class Print_Nto1 {

    static void N2One(int n) {

        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            N2One(n - 1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        N2One(n);

    }
}
