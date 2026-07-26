class Solution {
    public boolean canReach(int[] start, int[] target) {
        int ans = (start[0]+start[1])%2;
        int ans2 = (target[0]+target[1])%2;
        return ans==ans2;
    }
}