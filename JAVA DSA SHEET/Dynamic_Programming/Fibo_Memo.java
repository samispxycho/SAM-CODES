package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibo_Memo {

    static int solve(int n, int[] dp){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        
        return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the fibonacci of: ");
        int n = sc.nextInt();
        sc.close();

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int x= solve(n,dp);
        System.out.println(x);
    }
}
