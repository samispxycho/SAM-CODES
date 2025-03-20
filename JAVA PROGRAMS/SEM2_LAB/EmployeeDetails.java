package SEM2_LAB;
import java.util.Scanner;

class WrongNameException extends Exception{
    WrongNameException(String msg){
        super(msg);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String name;

        try{
            System.out.print("Enter name in capital: ");
            name=sc.nextLine();
            String upper=name.toUpperCase();
            if(!name.equals(upper)){
                throw new WrongNameException("I said enter only capital letters");
            }

            System.out.println("Enter designation");
            String desi=sc.nextLine();
            if(!desi.equals("manager") && !desi.equals("Clerk")){
                throw new WrongNameException("Desi should be only manager or clerk");
            }

            System.out.println("Enter id");
            int id=sc.nextInt();
            if(id<1 || id >5){
                throw new WrongNameException("id should be in between 1 and 5");
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }

    }
}
