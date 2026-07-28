class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int mid = n/2;
        Arrays.sort(arr , 0 , mid);
        for(int i = 0 ; i<mid ; i++){
            arr[n-i-1] = arr[i];
        }
        return new String(arr);
    }
}