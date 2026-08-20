class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ans = cost[0];
        int ans1 = cost[1];
        for(int i = 2 ; i<cost.length ; i++){
            int t = Math.min(ans+cost[i] , ans1+cost[i]);
            ans = ans1;
            ans1 = t;
        }
        return Math.min(ans , ans1);
    }
}

