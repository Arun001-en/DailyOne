class Solution {
    public int specialArray(int[] nums) {
        int[] freq = new int[nums.length+1];
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]>=nums.length){
                freq[nums.length]++;
            }
            else{
                freq[nums[i]]++;
            }
        }
        int c = 0;
        for(int i = nums.length ; i>=0 ; i--){
            c+=freq[i];
            if(c==i){
                return i;
            }
        }
        return -1;
    }
}