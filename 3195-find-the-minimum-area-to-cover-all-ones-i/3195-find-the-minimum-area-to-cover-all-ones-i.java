class Solution {
    public int minimumArea(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length;
       int minrow = m;
       int maxrow = -1;
       int mincol = n;
       int maxcol = -1;
       for(int i = 0 ; i<m ; i++){
        for(int j = 0 ; j<n ; j++){
           if(grid[i][j]==1){
            minrow = Math.min(minrow, i);
            maxrow = Math.max(maxrow , i);
            mincol = Math.min(mincol , j);
            maxcol = Math.max(maxcol , j);
           } 
        }
       }
        return (maxrow-minrow+1) * (maxcol-mincol+1);
    }
}