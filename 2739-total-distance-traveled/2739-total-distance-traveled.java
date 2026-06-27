class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int max = 0;
        while(mainTank>=5 && additionalTank>0){
            max+=50;
            mainTank = (mainTank-5)+1;
            additionalTank--;
        }
        max += mainTank*10;
        return max;
    }
}