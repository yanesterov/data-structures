package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">121. Best Time to Buy and Sell Stock</a>
 */
public class BestTimeToBuyAndSellStock {

    /**
     * Time complexity: O(N^2)
     * Space complexity: O(1)
     */
    public int maxProfitOld(int[] prices) {
        int maxProfit = 0;

        if (prices.length == 1) {
            return maxProfit;
        }

        for (int i = 0, j = 1; j < prices.length; i++, j++) {
            do {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                j++;
            } while (j < prices.length);
            j = i + 1;
        }

        return maxProfit;
    }

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}
