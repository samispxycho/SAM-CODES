import java.util.Scanner;

public class Validity {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter one integer number");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

        sc.close();
    }
}
