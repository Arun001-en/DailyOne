class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int num:nums){
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        for(int num:nums){
            if(h.get(num)!=3){
                ans = num;
                break;
            }
        }
        return ans;
    }
}