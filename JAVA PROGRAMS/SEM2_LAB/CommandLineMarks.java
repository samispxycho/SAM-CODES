package SEM2_LAB;

import java.util.Scanner;

public class CommandLineMarks {
    public static void main(String[] args) {

        int maxMarks = Integer.parseInt(args[0]);

        try {
            if (maxMarks <= 0) {
                throw new Exception("Marks should be greater than 0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        int marks = sc.nextInt();

        try{
            if(marks>maxMarks || marks<=0){
                throw new Exception("Please Enter valid marks");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        float percentage=((float)marks/maxMarks)*100;
        System.out.println("Percentage Obtained: "+percentage+"%");

    }
}
