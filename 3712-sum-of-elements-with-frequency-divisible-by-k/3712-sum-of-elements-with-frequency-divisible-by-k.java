class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num , h.getOrDefault(num , 0)+1);
        }
        int sum = 0;
        for(int num : h.keySet()){
            if(h.get(num)%k==0){
                sum+=num*h.get(num);
            }
        }
        return sum;
    }
}