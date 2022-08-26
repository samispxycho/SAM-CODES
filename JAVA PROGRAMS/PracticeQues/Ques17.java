import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a website name: ");
        String str=sc.nextLine();
        sc.close();

        if(str.endsWith(".com"))
        {
            System.out.println("Website entered is an commercial website");
        }
        else if(str.endsWith(".org"))
        {
            System.out.println("Website entered is an organizational website");
        }
        else if(str.endsWith(".in"))
        {
            System.out.println("Website entered is an indian website");
        }
        else
        {
            System.out.println("Invalid website entered");
        }
    }
}
