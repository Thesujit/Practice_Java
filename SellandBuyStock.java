
public class SellandBuyStock {
    public static int  SellandBuyStock(int prices []) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

         for (int i =0; i < prices.length;i++) {
        if (buyprice < prices[i]) {
            int profit = prices[i] - buyprice;
            maxProfit = Math.max(maxProfit, profit);
        } else {
            buyprice = prices[i];

        }
    }return maxProfit;
    }
 public static void main(String[] args) {
        int prices [] = {7,6,9,8,4,2,};
        System.err.println("Buy and Sell Stocks"+ prices);
    }
}