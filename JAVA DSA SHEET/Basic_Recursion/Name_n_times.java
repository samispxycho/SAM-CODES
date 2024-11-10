package Basic_Recursion;
import java.util.Scanner;

public class Name_n_times {

    static void printName(String str,int n){

        if(n==0)return;
        else{
            System.out.println(str);
            printName(str, n-1);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Print number of times name should be printed: ");
        int n=sc.nextInt();
        System.out.print("Enter name: ");
        String str=sc.next();
        sc.close();

        printName(str,n);

    }
}
