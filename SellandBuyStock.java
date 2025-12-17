
public class SellandBuyStock {
    public static int  SellandBuyStock(int prices []) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

         for (int i =0; i < prices.length;i++) {
        if (buyprice > prices[i]) {
            buyprice = prices[i];
        } else {
            int profit = prices[i] - buyprice;
            maxProfit = Math.max(maxProfit, profit);
        }
    }
        return maxProfit;
    }
}