class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        for(int i = 0 ; i<nums1.length ; i++){
            h1.add(nums1[i]);
        }
        HashSet<Integer> h2 = new HashSet<>();
        for(int i = 0 ; i<nums2.length ; i++){
            h2.add(nums2[i]);
        }
        int c = 0;
        for(int i = 0 ; i<nums1.length ; i++){
            if(h2.contains(nums1[i])){
                c++;
            }
        }
        int c2 = 0;
        for(int i = 0 ; i<nums2.length ; i++){
            if(h1.contains(nums2[i])){
                c2++;
            }
        }
        return new int[]{c , c2};
    }
}