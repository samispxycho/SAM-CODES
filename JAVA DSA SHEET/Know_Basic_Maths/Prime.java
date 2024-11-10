package Know_Basic_Maths;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 1;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }

        if(count == 2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime");
        }
    }
}
