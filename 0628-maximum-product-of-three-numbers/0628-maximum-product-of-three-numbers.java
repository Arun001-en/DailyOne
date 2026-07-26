class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int ans = nums[0]*nums[1]*nums[nums.length-1];
       int ans1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
       int max = Math.max(ans , ans1);
       return max; 
    }
}