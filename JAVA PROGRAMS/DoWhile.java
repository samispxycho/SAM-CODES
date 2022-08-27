//Write a program to print first n natural numbers using do while loop

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number upto which you want to print natural numbers: ");
        int num=sc.nextInt();
        sc.close();

        int i=1;

        do
        {
            System.out.println("The value of i at this position is "+i);
            i++;
        }while(i<=num);
    }
}
