import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string in uppercase: ");
        String str=sc.next();
        sc.close();
        str=str.toLowerCase();
        System.out.println("After converting to lowercase, modified string is: "+str);
    }
}
