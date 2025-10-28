package p0121_best_time_to_buy_and_sell_stock;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, candidateBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < candidateBuy) {
                candidateBuy = prices[i];
            }
            else if (prices[i] - candidateBuy > maxProfit) {
                maxProfit = prices[i] - candidateBuy;
            }
        }
        return Math.max(maxProfit, 0);
    }
}