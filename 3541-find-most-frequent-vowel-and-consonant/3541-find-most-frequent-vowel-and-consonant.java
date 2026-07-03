class Solution {
    public int maxFreqSum(String s) {
       int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        int maxVowels = 0;
        int maxConsonents = 0;
        for(int i = 0; i < 26; i++){
            char ch = (char)(i + 'a');
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxVowels = Math.max(maxVowels, freq[i]);
            } else{
                maxConsonents = Math.max(maxConsonents, freq[i]);
            }
        }
        return  maxVowels + maxConsonents;
    }
}