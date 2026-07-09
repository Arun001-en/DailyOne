class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[]ans=new int[2];
        int[]freq=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x=grid[i][j];
                freq[x]++;
            }
        }
        for(int i=0;i<n*n+1;i++){
            if(freq[i]==2){
                ans[0]=i;
            }
            if(freq[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}