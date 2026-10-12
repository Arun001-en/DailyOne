class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length , sum = 0;
        for(int i = 1 ; i<=nums.length ; i++){
            if(n%i==0){
                sum+=Math.pow(nums[i-1] , 2);
            }
        }
        return sum;
    }
}