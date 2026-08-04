class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}