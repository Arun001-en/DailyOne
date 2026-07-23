class Solution {
    public int countCharacters(String[] words, String chars) {
        // Phele frequency store kar lo chars ki
        int[] freq = new int[26];
        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }
        int ans = 0;
        for (String word : words) {
            int[] freq1 = new int[26];
            for (char ch1 : word.toCharArray()){
                freq1[ch1 - 'a']++;
            }
            boolean ok = true;
            for(int i = 0; i < 26; i++){
                if (freq1[i] > freq[i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                ans+=word.length();
            }
        }
        return ans;
    }
}