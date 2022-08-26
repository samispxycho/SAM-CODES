import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();
        sc.close();

        if(year%4==0)
        {
            System.out.println("Year entered is a leap year");
        }
        else
        {
            System.out.println("Year entered is not a leap year");
        }
    }
}
