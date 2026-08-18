class Solution {
    public int countValidPrefixes(String s) {
        int a = 0;
        int b = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)=='0'){
                b-=1;
            }
            if(s.charAt(i)=='1'){
                b+=1;
            }
            if(Math.abs(b)==1 || b==0){
                a+=1;
            }
        }
        return a;
    }
}