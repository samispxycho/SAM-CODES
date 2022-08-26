import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7: ");
        byte num=sc.nextByte();
        sc.close();

        switch(num)
        {
            case 1->System.out.println("Sunday");
            case 2->System.out.println("Monday");
            case 3->System.out.println("Tuesday");
            case 4->System.out.println("Wednesday");
            case 5->System.out.println("Thursday");
            case 6->System.out.println("Friday");
            case 7->System.out.println("Saturday");
            default->System.out.println("There are only 7 days ");
        }
    }
}
