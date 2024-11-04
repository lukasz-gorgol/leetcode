package com.beukot.easy;

/**
 * Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * #121
 */
public class BestTimeToBuyAndSellStock {
    /**
     * Initialize new Best Time to Buy and Sell Stock problem solver
     */
    public BestTimeToBuyAndSellStock() {
    }

    /**
     * You are given an array prices where prices[i] is the price
     * of a given stock on the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy
     * one stock and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     * 
     * @param prices
     *            - prices array over days
     * @return maximum achievable profit or 0 if none
     */
    public int maxProfit(int[] prices) {
        if (prices == null)
            return 0;
        if (prices.length == 0)
            return 0;

        int len = prices.length;
        if (len == 1)
            return 0;

        int buy_min = prices[0];
        int profit = 0;
        int sell_index = 1;
        int sell_val;

        while (sell_index < len) {
            sell_val = prices[sell_index];
            if (sell_val > buy_min) {
                profit = Math.max(profit, sell_val - buy_min);
            } else {
                buy_min = sell_val;
            }
            sell_index++;
        }
        return profit;
    }
}
