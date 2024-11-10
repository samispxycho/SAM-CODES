package Basic_Recursion;
import java.util.Scanner;

public class Factorial_N {

    static int fact(int n,int res){

        if(n==1){
            return res;
        }else{
            res=res*n;
            return fact(n-1,res);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();

        int res=fact(n,1);
        System.out.println("Factorial is: "+res);

    }
}
