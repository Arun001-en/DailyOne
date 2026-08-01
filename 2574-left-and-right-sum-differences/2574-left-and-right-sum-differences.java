class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0 ; i<n ; i++){
            int lsum = 0;
            int rsum = 0;
            for(int j = 0 ; j<i ; j++){
                lsum+=nums[j];
            }
            for(int j = i+1 ; j<n ; j++){
                rsum+=nums[j];
            }
            ans[i] = Math.abs(lsum-rsum);
        }
        return ans;
    }
}