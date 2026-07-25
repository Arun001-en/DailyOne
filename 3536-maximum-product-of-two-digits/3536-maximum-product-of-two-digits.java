class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int max2 = -1;
        while(n>0){
            int r = n%10;
            if(r>=max){
                max2 = max;
                max = r;
            }
            else if(r>max2){
                max2 = r;
            }
            n = n/10;
        }
        return max*max2;
    }
}