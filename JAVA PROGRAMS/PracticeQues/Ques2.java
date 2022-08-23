//Wap to calculate CGPA using marks of three subjects asked from the user

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args)
    {
        //Asking marks from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks scored in English: ");
        int eng=sc.nextInt();
        System.out.print("Enter your marks scored in Hindi: ");
        int hin=sc.nextInt();
        System.out.print("Enter your marks scored in Science: ");
        int sci=sc.nextInt();
        sc.close();

        //CGPA=percentage/10;

        //Calculating total marks and the percentage scored
        int total=eng+hin+sci;
        float percentage=(total*100)/300;   

        //Calculating and printing the CGPA scored
        float cgpa=percentage/10;
        System.out.print("Your CGPA is: ");
        System.out.println(cgpa);
    }
}
