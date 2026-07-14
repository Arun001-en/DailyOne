class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            ans.add(index[i] , nums[i]);
        }
        int[] ans1 = new int[ans.size()];
        for(int i = 0 ; i<ans.size() ; i++){
            ans1[i] = ans.get(i); 
        }
        return ans1;
    }
}