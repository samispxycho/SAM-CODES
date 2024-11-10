package Know_Basic_Maths;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();

        int temp = num;

        int rev=0;
        while(temp>0){
            int d=temp%10;
            rev = rev*10 + d;
            temp/=10;
        }

        if(rev == num)System.out.println("Pallindrome number");
        else System.out.println("Not pallindrome number");


    }
}
