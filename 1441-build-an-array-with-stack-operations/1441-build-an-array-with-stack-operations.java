class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        int result =1;
        for(int i = 0;i<target.length;i++){
            while(result<target[i]){
                ans.add("Push");
                ans.add("Pop");
                result++;
            }
            ans.add("Push");
            result++;
        }
        return ans;
    }
}