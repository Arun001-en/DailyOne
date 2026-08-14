class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character , Integer> h = new HashMap<>();
        for(char ch : s.toCharArray()){
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
        int ans = -1;
        for(char ch : h.keySet()){
            if(ans==-1){
                ans = h.get(ch);
            }
            else if(h.get(ch)!=ans){
                return false;
            }
        }
        return true;
    }
}