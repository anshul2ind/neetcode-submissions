class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length-1; i++) {
            for(int j = i+1; j < prices.length; j++) {
                profit = Math.max(profit,  prices[j] - prices[i]);
            }
        }
        return profit < 0 ? 0 : profit;
    }
}
