import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string with double or triple spaces: ");
        String str=sc.nextLine();
        sc.close();

        System.out.println("First double space is at index number: "+str.indexOf("  "));
        System.out.println("First triple space is at index number: "+str.indexOf("   "));
    }
}

//if the output is -1, that means the condition isnt matched, ie no results found.