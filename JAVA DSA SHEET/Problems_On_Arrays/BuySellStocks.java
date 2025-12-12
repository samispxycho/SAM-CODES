package Problems_On_Arrays;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - buy;
            profit = Math.max(profit, cost);
            buy = Math.min(buy, prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        BuySellStocks obj = new BuySellStocks();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}