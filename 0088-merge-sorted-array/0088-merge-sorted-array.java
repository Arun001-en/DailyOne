class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int k = 0;
        for(int i = 0 ; i<m ; i++){
            ans[k++] = nums1[i];
        }
        for(int j = 0 ; j<n ; j++){
            ans[k++] = nums2[j];
        }
        Arrays.sort(ans);
        for(int i = 0 ; i<m+n ; i++){
            nums1[i]=ans[i];
        }
    }
}