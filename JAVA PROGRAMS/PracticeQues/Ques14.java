import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in English: ");
        byte eng=sc.nextByte();
        System.out.print("Enter marks in Hindi: ");
        byte hindi=sc.nextByte();
        System.out.print("Enter marks in Science: ");
        byte sci=sc.nextByte();
        sc.close();

        int total=eng+hindi+sci;
        System.out.println("Total marks scored: "+total);

        float per=(total*100)/300;
        System.out.println("Percentage scored: "+per+"%");

        if(eng>=33 && hindi>=33 && sci>=33 && total>=40)
        {
            System.out.println("You have passed");
        }
        else
        {
            System.out.println("You have failed");
        }
    }
}
