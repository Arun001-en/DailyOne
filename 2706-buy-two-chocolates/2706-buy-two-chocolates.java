class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        for(int i = 0 ; i<n ; i++){
            int sum = prices[0]+prices[1];
            if(sum<=money){
                return money-sum;
            }
        }
        return money;
    }
}