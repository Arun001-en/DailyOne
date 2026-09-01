class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        // Yaha max area ko abhi k liye zero rakh liya compare karne k liye
        int maxArea = 0;
        while(left<right){
            // Yaha minimum height nikaal li
            int h = Math.min(height[left] , height[right]);
            // yaha width nikaal li foe=rmula ki help se
            int w = right-left;
            // Yaha area nikaal liya
            int area = h*w;
            // yaha area aur max area ko compare kar liya
            maxArea = Math.max(maxArea , area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}