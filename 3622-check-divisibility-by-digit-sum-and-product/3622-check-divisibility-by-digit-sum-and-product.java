class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int r = n;
        while(r>0){
            sum+=r%10;
            prod*=r%10;
            r = r/10;
        }
        return n % (sum+prod) ==0;
    }
}