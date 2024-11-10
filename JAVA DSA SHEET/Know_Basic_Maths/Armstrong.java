package Know_Basic_Maths;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int temp = num;

        int count = 0;
        while(temp>0){
            count++;
            temp/=10;
        }

        temp = num;
        int result=0;

        while(temp>0){
            int d = temp%10;
            result = result + (int) Math.pow(d, count);
            temp/=10;
        }

        if(result == num)System.out.println("Armstrong number");
        else System.out.println("Not armstrong number");
        
    }
}
