import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] marks = new int[10];
        marks[0] = 89;
        marks[1] = 90;
        marks[2] = 75;
        marks[3] = 77;
        marks[4] = 88;
        marks[5] = 69;
        marks[6] = 49;
        marks[7] = 65;
        marks[8] = 87;
        marks[9] = 70;

        /*
            OR
            int[] marks;
            marks=new int[10];

            OR
            int[] marks={89,90,75,77,88,69,49,65,87,70};
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find the percentage of: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Marks scored by student number " + num + " is: " + marks[num]);
    }
}
