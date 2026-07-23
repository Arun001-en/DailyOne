class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int max = 0;
        for(int num:nums){
            freq[num]++;
            max = Math.max(max , freq[num]);
        }
        int ans = 0;
        for(int i = 0 ; i<101 ; i++){
            if(freq[i]==max){
                ans+=max;
            }
        }
        return ans;
    }
}