class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int first = 3;
        int sec = 2;
        int curr = 0;
        for(int i = 3 ; i<n ; i++){
            curr = first+sec;
            sec = first;
            first = curr;
        }
        return curr;
    }
}