class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int max = -1;
        int ans = 0;
        for(int i = 0 ; i<m ; i++){
            int c = 0;
            for(int j = 0 ; j<n ; j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
            if(c>max){
                max = c;
                ans = i;
            }
        }
        return new int[]{ans , max};
    }
}