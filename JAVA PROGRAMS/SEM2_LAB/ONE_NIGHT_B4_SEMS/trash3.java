package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.util.Scanner;

public class trash3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of numerator: ");
        int num=sc.nextInt();
        System.out.print("Enter the value of denominator: ");
        int deno=sc.nextInt();

        int arr[]=new int[5];

        System.out.print("Enter the index number: ");
        int index=sc.nextInt();
        System.out.print("Enter the value: ");
        int val=sc.nextInt();

        sc.close();

        try{
            int result=num/deno;
            System.out.println("Result is: "+result);

        }catch(ArithmeticException ae){
            System.out.println("Number cant be divided by zero");
        }

        try{
            arr[index]=val;
            System.out.println("Value entered successfully");
        }catch(ArrayIndexOutOfBoundsException arrE){
            System.out.println("Cant add element at that index");
        }
        
    }
}
