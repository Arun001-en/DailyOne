class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        for(int num : students){
            if(num==0){
                zero++;
            }
            else{
                one++;
            }
        }
        for(int sand:sandwiches){
            if(sand==0){
                if(zero==0){
                    return one;
                }
                else{
                    zero--;
                }
            }
            else{
                if(one==0){
                    return zero;
                }
                else{
                    one--;
                }
            }
        }
        return 0;
    }
}