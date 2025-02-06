package SEM2_LAB;

import java.util.Scanner;

class Student{

    String name;
    int roll;
    int marks;

    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        System.out.print("Enter marks: ");
        marks=sc.nextInt();

        sc.close();
    }

    void output(){
        System.out.println("Student name is: "+name);
        System.out.println("Student roll number is: "+roll);
        System.out.println("Student marks are: "+marks);
    }

}

public class ClassStudent {
    public static void main(String[] args) {

        Student luffy = new Student();
        luffy.input();
        luffy.output();

    }
}
