class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int c = 0;
        int ans = 0;
        for(int freq:map.values()){
            c+=freq/2;
            ans+=freq%2;
        }
        return new int[]{c , ans};
    }
}