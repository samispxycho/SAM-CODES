package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.util.Scanner;

class UnderageException extends Exception{
    UnderageException(String msg){
        super(msg);
    }
}

public class trash8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        try{
            if(age<18){
                throw new UnderageException("You are too young to vote");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
