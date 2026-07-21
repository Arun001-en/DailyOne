class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int i = 0, j = mid;
        int cl = 0;
        int rc = 0;
        while (i < n / 2 && j < n) {
            if (isVowel(s.charAt(i))) cl++;
            if (isVowel(s.charAt(j))) rc++;
            i++;
            j++;
        }
        return cl == rc;
    }
    boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}
