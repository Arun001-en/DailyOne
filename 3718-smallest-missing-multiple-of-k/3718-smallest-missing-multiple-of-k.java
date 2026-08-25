class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Yaha hamne HashSet Banaya Usme saare element daal diye
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        // Yaha hamne t m k ki value daal di t = 2; for the first test case
        int t = k;
        // Yaha hamne check kiya ki set m t matlab 2 present h ki nahi
        while(s.contains(t)){
            // agar element present h to hum t ans k add karte rahenge
            t+=k;
        }
        // agar element nahi h to usse direct return kar denge
        return t;
    }
}