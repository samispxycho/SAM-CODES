package Dynamic_Programming;

public class Fibo_T {

    //fibo using tabulation-space optimized
    public int fibo(int n) {
        if(n==0)return 0;
        int ptop = 0;
        int prev = 1;
        for(int i=2;i<=n;i++){
            int curr = ptop + prev;
            ptop = prev;
            prev = curr;
        }
        return prev;
    }

    /*
    //Fibo using tabulation 
    public int fib(int n) {
        if(n==0)return 0;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    */

    public static void main(String[] args) {

        Fibo_T obj = new Fibo_T();
        int n = 5;
        System.out.println(obj.fibo(n));

        //System.out.println(obj.fib(n));       using classic tabulation
    }
}
