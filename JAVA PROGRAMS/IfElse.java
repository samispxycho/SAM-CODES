import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age=sc.nextByte();
        sc.close();
        
        if(age<18)
        {
            System.out.println("You are not eligible to vote");
        }
        else if(age==18)
        {
            System.out.println("You are 18, hence eligible to vote");
        }
        else
        {
            System.out.println("You can vote");
        }
    }
}
