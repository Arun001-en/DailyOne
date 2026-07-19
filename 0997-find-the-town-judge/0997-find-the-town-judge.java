class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] c = new int[n+1];
        for(int[] nums : trust){
            int u = nums[0];
            int v = nums[1];
            c[u]--;
            c[v]++;
        }
        for(int i = 1 ; i<=n ; i++){
            if(c[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}