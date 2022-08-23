//Wap to check whether the number entered by the user is of integer type

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of integer type only: ");
        System.out.println(sc.hasNextInt());
        sc.close();
        
    }
}
