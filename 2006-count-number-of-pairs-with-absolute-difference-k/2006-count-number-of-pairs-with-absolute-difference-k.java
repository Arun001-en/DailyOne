class Solution {
    public int countKDifference(int[] nums, int k) {
        int c = 0;
        int n = nums.length;
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    c++;
                }
            }
        }
        return c;
    }
}