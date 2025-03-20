package SEM2_LAB;

import java.util.Scanner;

class Emp{
    Scanner sc=new Scanner(System.in);

    int id;
    String name;
    int salary;

    void input(){
        System.out.print("Enter id: ");
        id=sc.nextInt();
        System.out.print("\nEnter name: ");
        name=sc.nextLine();
        System.out.print("\nEnter salary: ");
        salary=sc.nextInt();
    }

    static void display(Emp arr[]){
        for(Emp ele:arr){
            System.out.println(ele.id+" "+ele.name+" "+ele.salary);
        }
    }

    static void search(Emp arr[],int search_id){
        for(Emp ele:arr){
            if(ele.id==search_id){
                System.out.println("Employee found");
                System.out.println(ele.id+" "+ele.name+" "+ele.salary);
                return;
            }
        }
        System.out.println("Employee Not found");
    }

    static void update(Emp arr[],int update_id){
        Scanner sc=new Scanner(System.in);
        for(Emp ele:arr){
            if(ele.id==update_id){
                int new_salary;
                System.out.print("Enter new salary: ");
                new_salary=sc.nextInt();
                ele.salary=new_salary;
                System.out.println("Salary updated");
                return;
            }
        }
        System.out.println("Employee not found");
    }

}

public class ArrayOfEmp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Emp arr[]=new Emp[5];
        for(int i=0;i<5;i++){
            arr[i]=new Emp();
            arr[i].input();
        }

        int choice;
        while(true){
            System.out.println("Enter 1 to display\nEnter 2 to search\nEnter 3 to update\nEnter 4 to exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    Emp.display(arr);
                    break;
                case 2:
                    int search_id;
                    System.out.println("Enter id to search: ");
                    search_id=sc.nextInt();
                    Emp.search(arr, search_id);
                    break;
                case 3:
                    int update_id;
                    System.out.println("Enter id to update: ");
                    update_id=sc.nextInt();
                    Emp.update(arr, update_id);
                    break;
                case 4:
                    System.exit(0);
            }

        }

    }
}
