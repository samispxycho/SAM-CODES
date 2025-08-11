//Write a program to print first n natural numbers in reverse order

import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();

        for(int i=num;i>=1;i--)
        {
            System.out.println("The value of i at this position is: "+i);
        }
    }
}
