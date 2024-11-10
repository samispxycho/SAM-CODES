package Know_Basic_Maths;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int reverse=0;
        while(num>0){
            int d = num%10;
            reverse = reverse*10 + d;
            num/=10;
        }

        System.out.println("Reversed number is: "+reverse);

    }
}
