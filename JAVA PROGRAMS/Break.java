//Wap to print all the numbers till the point the number entered
//by the user is reached.[in total there are 100 numbers]

import java.util.Scanner;

public class Break
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1-100: ");   
        byte num=sc.nextByte();
        sc.close();
        
        for(int i=0;i<100;i++)
        {
            System.out.println("The value of i at this position is: "+i);
            if(i==num)
            {
                break;
            }
        }
    }
}