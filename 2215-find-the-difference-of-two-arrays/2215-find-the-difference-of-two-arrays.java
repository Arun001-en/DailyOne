class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>(); // Ye saare Element ko store karne k liye
        HashSet<Integer> s1 = new HashSet<>(); 
        HashSet<Integer> s2 = new HashSet<>(); 
        for(int i = 0 ; i<nums1.length ; i++){
            s1.add(nums1[i]); // Phele nums1 ke saare element Set1 m daal diye
        }
        for(int i = 0 ; i<nums2.length ; i++){
            s2.add(nums2[i]); // Phir nums2 ke saare element Set2 m daal diye
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int num:s1){
            if(!s2.contains(num)){ // Yaha Check kar liye ki set 1 k element set 2 m h ki nahi
                l1.add(num); // Yaha ekk ArrayList Bana k jo element nahi h unhe add kar diya set 1 k 
            }
        }
        for(int num:s2){  // Yaha Check kar liye ki set 2 k element set 1 m h ki nahi
            if(!s1.contains(num)){
                l2.add(num); // Yaha ekk ArrayList Bana k jo element nahi h unhe add kar diya set 2 k 
            }
        }
        // End m jo bhi elemnt same nahi h dono sets m usse final 2d ArrayList m add kar diya one by one
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}