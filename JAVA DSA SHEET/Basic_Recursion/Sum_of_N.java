package Basic_Recursion;
import java.util.Scanner;

public class Sum_of_N {

    static int SumOfN(int n,int s){

        if(n==0){
            return s;
        }else{
            s+=n;
            return SumOfN(n-1,s);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();

        int sum=SumOfN(n,0);
        System.out.println(sum);
        

    }
}
