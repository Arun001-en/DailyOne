class Solution {
    public String reversePrefix(String words, char ch) {
        int n = words.length();
        StringBuilder sb = new StringBuilder();
        String ans = "";
        int idx = -1;
        for(int i = 0 ; i<n ; i++){
            char ch1 = words.charAt(i);
            sb.append(ch1);
            if(ch1==ch){
            idx = i;
            break;
        }
    }
    if(idx == -1) return words;
    sb.reverse();
    ans = sb.toString() + words.substring(idx+1);
    return ans;
    }
}