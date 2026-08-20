class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ans = cost[0]; // Yaha Phela element store kar liya
        int ans1 = cost[1]; // Yaha Dusra Element store kar liya
        for(int i = 2 ; i<cost.length ; i++){
            int t = Math.min(ans+cost[i] , ans1+cost[i]); // yaha par phela element aur ith element ko add karke dono kaa min nikal liya 
            ans = ans1; // yaha replace kar diye ans m ans1 kaa element daal diya
            ans1 = t; // yaha ans1 m to t kaa elemnt aaya tha usse daal diya
        }
        return Math.min(ans , ans1); // yaha compare kar liya aur min return kar diya
    }
}

