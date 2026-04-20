class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i+1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if(diff > profit) {
                    profit = diff;
                }
            }
        }

        return profit;
    }
}
