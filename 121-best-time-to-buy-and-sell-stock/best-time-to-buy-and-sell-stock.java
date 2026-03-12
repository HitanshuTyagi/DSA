class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            minprice=Math.min(prices[i],minprice);

            int profit=prices[i]-minprice;

            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}