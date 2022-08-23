/*
    Wap that asks user his name and then displays the message
    Hello <name>, have a wonderful day.
*/

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args)
    {
        //Asking user his name
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your good name?");
        String name=sc.next();
        sc.close();

        //Displaying the message
        System.out.println("Hello "+ name + ", have a wonderful day.");
    }
}
