package Dynamic_Programming;

public class Fibo_Tabu {
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }

    //Tabulation with space optimized
    // public static void main(String[] args) {
    //     int n = 5;
    //     int prev = 1;
    //     int ptop = 0;

    //     for(int i=2;i<=n;i++){
    //         int curr = ptop + prev;
    //         ptop = prev;
    //         prev = curr;
    //     }
    //     System.out.println(prev);
    // }
    
}
