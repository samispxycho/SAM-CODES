package SEM2_LAB;

import java.util.Scanner;

class Emp {

    int id;
    String name;
    int salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter salary: ");
        salary = sc.nextInt();
    }

    static void display(Emp[] arr) {
        for (Emp ele : arr) {
            System.out.println("Details: " + ele.id + "\t" + ele.name + "\t" + ele.salary);
            System.out.println();
        }
    }

    static void search(Emp[] arr, int id) {
        for (Emp ele : arr) {
            if (ele.id == id) {
                System.out.println("Employee Found");
                System.out.println("Details: " + ele.id + "\t" + ele.name + "\t" + ele.salary);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void update(Emp arr[], int id2) {
        Scanner sc2 = new Scanner(System.in);
        for (Emp ele : arr) {
            if (ele.id == id2) {
                System.out.println("Enter updated salary: ");
                int newSal = sc2.nextInt();
                ele.salary = newSal;

                System.out.print("Salary Updated: ");
                System.out.println("Details: " + ele.id + "\t" + ele.name + "\t" + ele.salary);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

}

public class EmpClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Emp[] arr = new Emp[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = new Emp();
            arr[i].input();
        }

        while (true) {

            System.out.print("1: Display\t2: Search\t3: Update\t4: exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Emp.display(arr);
                    break;

                case 2:
                    System.out.println("Enter id to search: ");
                    int id = sc.nextInt();
                    Emp.search(arr, id);
                    break;

                case 3:
                    System.out.println("Enter id to update: ");
                    int id2 = sc.nextInt();
                    Emp.update(arr, id2);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Enter valid operation");

            }
        }

    }
}
