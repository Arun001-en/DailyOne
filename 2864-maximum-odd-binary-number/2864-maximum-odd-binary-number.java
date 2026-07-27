class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int c1 = 0;
        int c0 = 0;
        int n = s.length();
        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i)=='0'){
                c0++;
            }
            else{
                c1++;
            }
        }
        c1--;
        while(c1>0){
            sb.append('1');
            c1--;
        }
        while(c0>0){
            sb.append('0');
            c0--;
        }
        sb.append('1');
        return sb.toString();
    }
}