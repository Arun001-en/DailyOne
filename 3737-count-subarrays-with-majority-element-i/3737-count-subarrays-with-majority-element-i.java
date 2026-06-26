class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int c = 0;
            int f = 0;
            for(int j = i ; j<nums.length ; j++){
                c++;
                if(nums[j]==target){
                    f++;
                }
                if(f>c/2){
                    res++;
                }
            }
        }
        return res;
    }
}