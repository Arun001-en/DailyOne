class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int mul = 1;
        int x = 0;
        while(n>0){
            int r = n%10;
            sum+=r;
            if(r!=0){
                x+=r*mul;
                mul*=10;
            }
            n = n/10;
        }
        return 1L*x*sum;
    }
}