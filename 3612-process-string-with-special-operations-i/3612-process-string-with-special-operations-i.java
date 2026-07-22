class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (ch == '*') {
                if(ans.length() > 0){
                    ans.deleteCharAt(ans.length() - 1);
                }
            }
            else if(ch == '#') {
                ans.append(ans);
            }
            else if(ch == '%') {
                ans.reverse();
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}