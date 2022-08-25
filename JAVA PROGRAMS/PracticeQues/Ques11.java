import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {

        String temp="Dear <name>, have a good day";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        sc.close();

        temp=temp.replace("<name>",name);
        System.out.println(temp);
    }
}
