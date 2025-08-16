package Problems_On_Arrays;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int least = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - least;
            profit = Math.max(profit,cost);
            least = Math.min(least,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        BuySellStocks obj = new BuySellStocks();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}