class Solution {
    public String compressedString(String word) {
       int n = word.length();
       int i = 0;
       String ans = "";
       while(i<n){
        int c = 0;
        char ch = word.charAt(i);
        while(i<n && c<9 && word.charAt(i)==ch){
            c++;
            i++;
        }
        ans+=String.valueOf(c)+ch;
       } 
       return ans;
    }
}