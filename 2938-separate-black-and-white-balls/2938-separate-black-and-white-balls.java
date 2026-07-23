class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        int minC = 0;
        long ans = 0;
        // 1 ko right Swap Karna h
        // 0 ko left Swap karna h 
        // Swap karke count ko + karna h
        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                minC++; 
            }
            else{
                ans+=minC;
            }
        }
        return ans;
    }
}