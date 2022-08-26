import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age=sc.nextByte();
        sc.close();

        switch(age)
        {
            case 17 ->System.out.println("You will turn 18 next year");
            case 18->System.out.println("You are now 18");
            case 19->System.out.println("You have turned 18 plus now");
            default->System.out.println("Only for age groups 17,18,19");
        }
    }
}
