import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int fact = 1;

        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of the number entered is: " + fact);
    }
}
