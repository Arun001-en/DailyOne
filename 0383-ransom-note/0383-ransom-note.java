class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        int freq[] = new int [26];
        for(int i = 0;i<m;i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<n;i++){
            freq[ransomNote.charAt(i)-'a']--;
        }
        for(int i = 0;i<26;i++){
            if(freq[i]<0) return false;
        }
        return true;
    }
}