//Wap to add three numbers asked from the user

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);      

        //Asking numbers from the user
        System.out.print("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter your third number: ");
        int num3=sc.nextInt();
        sc.close();

        //Calculating and printing the total
        int total=num1+num2+num3;
        System.out.print("The sum of the three numbers entered is: ");
        System.out.println(total);
    }
}
