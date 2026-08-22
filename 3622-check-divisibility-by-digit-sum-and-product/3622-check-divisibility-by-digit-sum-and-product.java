class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int r = n;
        while(r>0){
            sum+=r%10; // Yaha Humne sum nikaal liya digit kaa
            prod*=r%10; // Yaha humne product nikaal liya digit kaa
            r = r/10; // digit ko chota karte gye
        }
        int sum2 = sum+prod; // yaha dono kaa sum nukaal liya 
        if(n%sum2==0){ // yaha check kar liya ki dono kaa sum n ko complete divide kar rha h ki nahi
            return true;
        }
        return false;
    }
}