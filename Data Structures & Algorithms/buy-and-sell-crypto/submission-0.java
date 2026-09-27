class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPtr = 0; int sellPtr = 1;
        while (buyPtr < sellPtr && sellPtr < prices.length) {
            if (prices[buyPtr] < prices[sellPtr]) {
                int profit = Math.subtractExact(prices[sellPtr], prices[buyPtr]);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPtr = sellPtr;
            }
            sellPtr += 1;
        }
        return maxProfit;
        
    }
}
