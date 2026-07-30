class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int l = -(k+1);
        for(int i = 0 ; i<n ; i++){
            if(nums[i]==1){
                if(i-l-1<k){
                    return false;
                }
                l = i;
            }
        }
        return true;
    }
}