//Wap to print all the numbers from 1-100 but skip the number that
//the user has entered.

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1-100: ");
        byte num=sc.nextByte();
        sc.close();

        for(int i=1;i<=100;i++)
        {
            if(i==num)
            {
                continue;
            }
            System.out.println("The value of i at this position is: "+i);
        }
    }
}
