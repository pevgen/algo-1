package ml.pevgen.algo.leetcode.n121;


/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock/</a>
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println("maxProfit(0); expected 0 = " + maxProfit(new int[]{0}));
        System.out.println("maxProfit([7,1,5,3,6,4]); expected 5 = " + maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("maxProfit([3,3,5,0,0,3,1,4]); expected 4 = " + maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println("maxProfit([7,6,4,3,1]); expected 0 = " + maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println("maxProfit([1,4,2]); expected 3 = " + maxProfit(new int[]{1, 4, 2}));
    }

    public static int maxProfit(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minBuyPrice) {
                minBuyPrice = price;
            } else if (price - minBuyPrice > maxProfit) {
                maxProfit = price - minBuyPrice;
            }
        }
        return maxProfit;
    }

    public static int maxProfitBrute(int[] prices) {
        int result = 0;
        int minBuyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuyPrice) {
                int maxSellPrice = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    if (maxSellPrice <= prices[j]) {
                        if (prices[j] - prices[i] > result) {
                            result = prices[j] - prices[i];
                            minBuyPrice = prices[i];
                            maxSellPrice = prices[j];
                        }
                    }
                }
            }
        }
        return result;
    }
}
