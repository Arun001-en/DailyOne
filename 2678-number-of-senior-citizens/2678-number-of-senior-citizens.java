class Solution {
    public int countSeniors(String[] details) {
       int c = 0;
        for(int i = 0; i < details.length; i++){
            String str = details[i];
            int age = Integer.valueOf(str.substring(11,13));
            if(age > 60){
                c++;
            }
        }
        return c;
    }
}