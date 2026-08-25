class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int t = k;
        while(s.contains(t)){
            t+=k;
        }
        return t;
    }
}