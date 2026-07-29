class Solution {
    public int[][] reverseSubmatrix(int[][] arr, int r, int c, int k) {
        int startrow = r;
        int endrow =r+k-1;
        int startcol = c;
        int endcol = c+k-1;
        for(int i = startrow ; i<=endrow ; i++){
            for(int j = startcol ; j<=endcol ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[endrow][j];
                arr[endrow][j] = temp;
            }
            endrow--;
        }
        return arr;
    }
}