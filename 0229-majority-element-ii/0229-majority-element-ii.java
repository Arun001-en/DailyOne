class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer , Integer> h = new HashMap<>();
        int c = n/3;
        for(int num : nums){
            h.put(num , h.getOrDefault(num , 0)+1);
        }
        for(int i : h.keySet()){
            if(h.get(i)>c){
                ans.add(i);
            }
        }
        return ans;
    }
}