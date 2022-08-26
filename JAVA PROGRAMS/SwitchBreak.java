import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age=sc.nextByte();
        sc.close();

        switch(age)
        {
            case 17:
            {
                System.out.println("You will turn 18 next year");
                break;
            }
            case 18:
            {
                System.out.println("You are now 18");
                break;
            }
            case 19:
            {
                System.out.println("You are 18 plus now");
                break;
            }
            default:
            {
                System.out.println("Only for age groups 17,18,19");
            }
        }
    }
}
