class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> ans = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ans.contains(ch)){
                return ch;
            }
            ans.add(ch);
        }
        return ' ';
    }
}