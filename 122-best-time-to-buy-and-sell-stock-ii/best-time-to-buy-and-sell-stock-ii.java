class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        int profit1 =0;
        int buy = prices[0];
        for(int i =1;i<prices.length;i++){
            int profit = prices[i]-buy;
            if(prices[i]>=buy){
                maxprofit = Math.max(maxprofit,profit);
                profit1+=maxprofit;
                buy = prices[i];
                maxprofit = 0;
            }
            else{
                buy = prices[i];
            }
        }
        return profit1;
    }
}