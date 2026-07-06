class Solution {
    public int[][] onesMinusZeros(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] diff = new int[m][n];
        int[] r = new int[m];
        int[] c = new int[n];
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(arr[i][j]==1){
                    r[i]+=arr[i][j];
                    c[j]+=arr[i][j];
                }
            }
        }
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                diff[i][j] = (2*r[i]-m) + (2*c[j]-n);
            }
        }
        return diff;
    }
}