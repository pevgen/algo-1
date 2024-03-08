package ml.pevgen.algo.leetcode.n122;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/</a>
 * <br/>
 * NB: You need to paint graph and find all increasing lines (and points from given array)
 * <br/>
 * <a href="https://www.youtube.com/watch?v=XcJyzicbGn8">
 * The grate explanation</a>
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int totalProfit = 0;

        int minBuyPrice = Integer.MAX_VALUE;
        int currentProfit = 0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            }

            if (prices[i] - minBuyPrice > currentProfit) {
                currentProfit = prices[i] - minBuyPrice;
            } else {
                totalProfit = totalProfit + currentProfit;
                currentProfit = 0;
                minBuyPrice = prices[i];
            }

        }
        totalProfit = totalProfit + currentProfit;
        return totalProfit;
    }

}
