class Solution {
    public int triangularSum(int[] nums) {
        int ans = nums.length;
       while(ans!=1){
          for(int i = 0 ; i<nums.length-1 ; i++){
            nums[i] = (nums[i]+nums[i+1])%10;
        }
        ans--;
       }
       return nums[0];
    }
}