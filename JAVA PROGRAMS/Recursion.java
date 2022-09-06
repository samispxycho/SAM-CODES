import java.util.Scanner;

public class Recursion {
    static int factorial(int x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }
        else
        {
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to find the factorial of: ");
        int num=sc.nextInt();
        sc.close();

        int result=factorial(num);
        System.out.println("Factorial of the entered number is: "+result);
    }
}
