class Solution {
    public boolean isBalanced(String num) {
        int evensum = 0;
        int oddsum = 0;
        for(int i = 0 ; i<num.length() ; i++){
            int ans = num.charAt(i)-'0';  // yaha string ko digit m change kar diya
            if(i%2==0){
                evensum+=ans;
            }
            if(i%2!=0){
                oddsum+=ans;
            }
        }
        return evensum== oddsum;
    }
}