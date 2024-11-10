package Basic_Recursion;
import java.util.Scanner;

public class Fibonacci {

    static int fibo(int n){
        
        if(n==0)return 0;
        if(n==1)return 1;

        return fibo(n-1)+fibo(n-2);

    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();

    
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }

        /*
        int n1=0,n2=1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        while(n2<n){
            int sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }
        */

    }
}
