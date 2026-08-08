class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;

        // Sabse phele hasset m allowed k saare ch daal diye
        HashSet<Character> ans = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            ans.add(ch);
        }
        // Yaha words par iterate kiya
        for(String ch1 : words){
            for(int i = 0 ; i<ch1.length() ; i++){
                if(!ans.contains(ch1.charAt(i))){
                    break;
                }
                if(i==ch1.length()-1){
                    c++;
                }
            }
        }
        return c;
    }
}