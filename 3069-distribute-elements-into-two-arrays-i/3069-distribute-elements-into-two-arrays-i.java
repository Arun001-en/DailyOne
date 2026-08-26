class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        // Yaha Par Hamne 1st and second Element ko Add kar diya do arryList ki madad se
        arr.add(nums[0]);
        arr1.add(nums[1]);   
        // yaha Par arr m [5]  Aur arr1 m [4] add ho gya; 

        // Yaha Par hum 3rd Element Se start hue
        for(int i = 2 ; i<nums.length ; i++){
            // Yaha Check kara ki arr m add kiya hua element arr1 se bada h ki chota agar 
            // bada hua to arr m add hoga

            if(arr.get(arr.size()-1) > arr1.get(arr1.size()-1)){
                arr.add(nums[i]);
                // Ider condition true hui arr kaa [5] bada h arr1 k [4] se
                // To arr m 3 add ho gya abb arr [5 , 3] h
            }
            // Nahi to arr1 m add ho jaayega
            else{
                arr1.add(nums[i]);
                // Yaha abb ekk condition false h kyuki jab if wali condition chali tab 3 < 4 se isiliye
                // abb arr1 h [4 , 8];
            }
        }
        // Yaha Par elements ko Copy kar diya jo mene chatgpt se dekha tha element kese copy karte h
        int i = 0;
        for(int num : arr){
            nums[i] = num;
            i++;
        }
        for(int num : arr1){
            nums[i] = num;
            i++;
        }
        return nums;
    }
}