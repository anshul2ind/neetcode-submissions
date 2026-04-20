class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;
        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                int diff = prices[right] - prices[left];
                profit = diff > profit ? diff : profit;
            } else {
                left = right;
            }
            right++;
        }

        return profit;
    }
}
