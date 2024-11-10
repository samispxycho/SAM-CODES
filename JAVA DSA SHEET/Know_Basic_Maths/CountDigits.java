package Know_Basic_Maths;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }

        System.out.println("The count is: "+count);

    }
}
