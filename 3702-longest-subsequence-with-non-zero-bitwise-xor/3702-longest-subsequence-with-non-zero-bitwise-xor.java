class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean nonzero = false;
        for(int x : nums){
            ans^=x;
            if(x!=0){
                nonzero= true;
            }
        }
        if(ans!=0){
            return nums.length;
        }
        if(nonzero){
            return nums.length-1;
        }
        return 0; 
    }
}