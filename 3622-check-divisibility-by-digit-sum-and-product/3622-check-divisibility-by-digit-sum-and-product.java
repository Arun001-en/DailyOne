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
        int sum2 = sum+prod;
        if(n%sum2==0){
            return true;
        }
        return false;
    }
}