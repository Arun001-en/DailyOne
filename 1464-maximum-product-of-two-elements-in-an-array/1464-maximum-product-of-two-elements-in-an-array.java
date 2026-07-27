class Solution {
    public int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int mul = 1;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                mul = (arr[i]-1)*(arr[j]-1);
                max = Math.max(mul , max);
            }
        }
        return max;
    }
}