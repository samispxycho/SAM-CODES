import java.util.Scanner;

public class CalcPercentage {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //READING DETAILS FROM THE KEYBOARD
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your roll number: ");
        long roll=sc.nextLong();

        System.out.print("Enter marks scored in English: ");
        int eng=sc.nextInt();

        System.out.print("Enter marks scored in Hindi: ");
        int hindi=sc.nextInt();

        System.out.print("Enter marks scored in Mathematics: ");
        int math=sc.nextInt();

        System.out.print("Enter marks scored in Science: ");
        int sci=sc.nextInt();

        System.out.print("Enter marks scored in Computer Science: ");
        int cs=sc.nextInt();

        sc.close();

        //JUST FOR DESIGN
        System.out.println();
        System.out.println("**************************************************");
        System.out.println();

        //PRINTING THE DETAILS
        System.out.print("Name entered is: ");
        System.out.println(name);
        System.out.print("Roll number entered is: ");
        System.out.println(roll);

        System.out.print("English: ");
        System.out.println(eng);
        System.out.print("Hindi: ");
        System.out.println(hindi);
        System.out.print("Maths: ");
        System.out.println(math);
        System.out.print("Science: ");
        System.out.println(sci);
        System.out.print("Computer Science: ");
        System.out.println(cs);

        //JUST FOR DESIGN
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        //CALCULATING AND PRINTING THE TOTAL MARKS
        int total=eng+hindi+math+sci+cs;
        System.out.print("Total marks scored out of 500 are: ");
        System.out.println(total);

        //CALCULATING AND PRINTING THE PERCENTAGE SCORED
        float percentage=(total*100)/500f;
        System.out.print("Percentage scored: ");
        System.out.print(percentage);
        System.out.println("%");

    }
}
