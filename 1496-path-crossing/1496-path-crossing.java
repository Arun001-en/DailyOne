class Solution {
    public boolean isPathCrossing(String path) {
        int n = path.length();
        int x = 0;
        int y = 0;
        HashSet<String> st = new HashSet<>();
        st.add("0_0");
        for(int i = 0 ; i<n ; i++){
            if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            String ans = x + "_" + y;
            if(!st.add(ans)){
                return true;
            }
        }
        return false;
    }
}