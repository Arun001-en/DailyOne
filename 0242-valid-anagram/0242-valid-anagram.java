class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = new String(ch);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        t = new String(ch2);
        return s.equals(t); 
    }
}