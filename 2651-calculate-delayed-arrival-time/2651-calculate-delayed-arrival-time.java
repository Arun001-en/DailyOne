class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = (arrivalTime+delayedTime)%24;
        return sum;
    }
}