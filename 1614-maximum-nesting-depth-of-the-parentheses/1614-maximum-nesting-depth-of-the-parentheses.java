class Solution {
    public int maxDepth(String s) {
        int dept=0;
        int max=0;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') dept++;
            max=Math.max(max,dept);
            if(s.charAt(i)==')') dept--;
        }
      return max;
    }
}