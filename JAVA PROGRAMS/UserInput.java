//Program to add two numbers by taking values from the user

import java.util.Scanner;   //header file

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers");

        Scanner sc=new Scanner(System.in);  //creating object

        System.out.println("Enter your first number");
        int num1=sc.nextInt();  //Taking value[integer type]

        System.out.println("Enter your second number");
        int num2=sc.nextInt();  //Taking value[integer type]

        sc.close();     //closing the object to avoid warning errors

        int sum=num1+num2;
        System.out.print("Addition of the numbers is ");
        System.out.println(sum);
    }
}

