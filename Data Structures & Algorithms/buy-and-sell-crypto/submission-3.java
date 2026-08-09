class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            int buy = prices[l];
            int sell = prices[r];
            if (buy < sell) {
                profit = Math.max(profit, sell - buy);
            } else {
                l = r;
            }
            ++r;
        }
        return profit < 0 ? 0 : profit;
    }
}
