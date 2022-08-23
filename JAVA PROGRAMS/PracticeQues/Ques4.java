//Wap to covert kilometers to miles.(Ask value from the user)

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) 
    {
        //Asking user the value in kilometers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value in kilometers: ");
        float kilo=sc.nextFloat();
        sc.close();
        
        // 1km = 0.62137119224 miles
        double miles=kilo*0.62137119224;
        System.out.println("In miles the value is "+miles);
    }
}
