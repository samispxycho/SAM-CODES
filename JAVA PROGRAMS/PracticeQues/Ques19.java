import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();

        int sum=0;
        int i=0;
        while(i<num)
        {
            sum=sum+(2*i);
            i++;
        }
        System.out.println("Sum of even numbers is: "+sum);
    }
}

//We can calculate even numbers using the formula 2*i
//and odd numbers using the formula 2*i+1
