package Dynamic_Programming;

public class Fibo_M {

    //Memoization way
    static int fibo(int n,Integer dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=null) return dp[n];

        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
    }

    /*
    Fibonacci using classic recursion
    static int nthFibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    */
    
    public static void main(String[] args) {

        int n=5;
        Integer dp[] = new Integer[n+1];   
        int result = fibo(n,dp);
        System.out.println(result);

        //System.out.println(nthFibonacci(n));      for classic recursive way
    }
}