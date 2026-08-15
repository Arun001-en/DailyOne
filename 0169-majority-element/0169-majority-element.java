class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = n/2;
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num , h.getOrDefault(num , 0)+1);
        }
        for(int i : h.keySet()){
            if(h.get(i)>ans){
                return i;
            }
        }
        return -1;
    }
}