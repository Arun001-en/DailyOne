class Solution {
    public long countVowels(String word) {
       long c = 0;
       int n = word.length();
       for(int i = 0 ; i<word.length() ; i++){
          char ch = word.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            c+=(long)(i+1)*(n-i);
          }
       } 
       return c;
    }
}