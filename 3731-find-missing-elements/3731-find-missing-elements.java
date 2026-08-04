class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }
        for(int i = 0 ; i<nums.length ; i++){
            s.add(nums[i]);
        }
        for(int i = min ; i<=max ; i++){
            if(!s.contains(i)){
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}