class Solution {
    public boolean checkIfPangram(String sentence) {
       String ans = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < ans.length(); i++) {
			if (sentence.indexOf(ans.charAt(i)) == -1) {
				return false;
			}
		}
		return true; 
    }
}