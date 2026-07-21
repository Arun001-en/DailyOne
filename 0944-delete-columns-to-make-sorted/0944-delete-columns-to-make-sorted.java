class Solution {
    public int minDeletionSize(String[] s) {
       int n = s.length;
       int k = s[0].length();
       int c = 0;
       for(int i = 0 ; i<k ; i++){
        for(int j = 1 ; j<n ; j++){
            if(s[j].charAt(i)<s[j-1].charAt(i)){
                c++;
                break;
            }
        }
       } 
       return c;
    }
}