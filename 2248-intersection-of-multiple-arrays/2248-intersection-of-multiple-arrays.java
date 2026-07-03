class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == nums.length) {
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}