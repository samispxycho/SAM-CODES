import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string with spaces in between: ");
        String str=sc.nextLine();
        sc.close();

        str=str.replace(" ","_");
        System.out.println("After modifying, the new string is: "+str);
    }
}
