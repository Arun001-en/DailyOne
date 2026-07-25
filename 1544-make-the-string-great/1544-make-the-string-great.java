class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
           else if (!st.isEmpty() && Character.toLowerCase(st.peek()) == Character.toLowerCase(ch) 
                && st.peek() != ch) {
                    st.pop();
                }
                else{
                     st.push(ch);
                }
            }
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}