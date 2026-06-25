class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        double sumOfarr = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sumOfarr += arr[i];
        }
        return sumOfarr / (arr.length - 2);
    }
}