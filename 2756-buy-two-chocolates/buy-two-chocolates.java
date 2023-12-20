class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int diff = 0;
        if(prices[0]+prices[1]<=money){
            diff= money-(prices[0]+prices[1]);
        }
        else{
            return money;
        }
        return diff;
    }
}