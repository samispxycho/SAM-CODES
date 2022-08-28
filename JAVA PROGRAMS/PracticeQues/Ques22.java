import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + (num * i);
        }
        System.out.println(sum);
    }
}
