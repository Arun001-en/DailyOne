class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int i = 0;
        int ans = 0;
        while(i<=arr.length-2){
            if(arr[i]<arr[i+1]){
                i++;
            }
            else{
                ans = 1;
                break;
            }
        }
        while(i<=arr.length-2){
            if(arr[i]>arr[i+1]){
                i = i+1;
            }
            else{
                ans = 2;
                break;
            }
        }
        if(ans==1){
            return true;
        }
        return false;
    }
}