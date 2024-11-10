package Basic_Recursion;
import java.util.Scanner;

public class Print_1toN {

    static void One2N(int n){

        if(n==0){
            return;
        }else{
            One2N(n-1);
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();

        One2N(n);

    }  
}
