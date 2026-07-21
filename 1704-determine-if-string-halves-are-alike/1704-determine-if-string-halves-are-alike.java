class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int i = 0, j = mid;
        int cl = 0;
        int rc = 0;
        HashSet<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        while (i < n / 2 && j < n) {
            if (st.contains(s.charAt(i))) cl++;
            if (st.contains(s.charAt(j))) rc++;
            i++;
            j++;
        }
        return cl == rc;
    }
}
