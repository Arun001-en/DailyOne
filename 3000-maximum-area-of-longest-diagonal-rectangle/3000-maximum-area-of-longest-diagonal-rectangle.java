class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int n = d.length;
       int maxdig = 0;
       int maxarea = 0;
        for(int i = 0 ; i<n ; i++){
            int l = d[i][0];
            int w = d[i][1];
            int dig = l*l+w*w;
            int area = l*w;
            if(dig>maxdig){
                maxdig = dig;
                maxarea = area;
            }
            else if(dig==maxdig){
                maxarea = Math.max(maxarea , area);
            }
        } 
        return maxarea;
    }
}