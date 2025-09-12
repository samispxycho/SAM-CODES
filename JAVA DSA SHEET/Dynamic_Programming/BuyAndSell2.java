package Dynamic_Programming;

public class BuyAndSell2 {

    // Recursive Approach
    /*
    static int solve(int prices[],int index,boolean able,int n){

        if(index == n)return 0;
        int profit = 0;

        if(able){
            
            int buy = -prices[index] + solve(prices,index+1,false,n);
            int skip = 0 + solve(prices,index+1,true,n);

            profit = Math.max(buy,skip);

        }else{
            
            int sell = prices[index] + solve(prices,index+1,true,n);
            int skip = 0 + solve(prices,index+1,false,n);

            profit = Math.max(sell,skip);
        }
        return profit;
    }
    */

    //Memoization Approach
    static int solve(int prices[],int index,int able,int n,Integer dp[][]){

        if(index == n)return 0;

        if(dp[index][able]!=null)return dp[index][able];

        int profit = 0;

        if(able==1){
            
            int buy = -prices[index] + solve(prices,index+1,0,n,dp);
            int skip = 0 + solve(prices,index+1,1,n,dp);

            profit = Math.max(buy,skip);

        }else{
            
            int sell = prices[index] + solve(prices,index+1,1,n,dp);
            int skip = 0 + solve(prices,index+1,0,n,dp);

            profit = Math.max(sell,skip);
        }
        return dp[index][able] = profit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int n = prices.length;

        Integer dp[][] = new Integer[n+1][2];
        int result = solve(prices,0,1,n,dp);

        System.out.println("Maximum Profit: " + result);
    }
}