class Solution {
    int find(int num){
        int prod = 1;
        while(num>0){
            prod = prod * (num%10);
            if(prod==0){
                return 0;
            }
            num = num/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for(int num = n ; num<=n+10 ; num++){
            if(find(num)%t==0){
                return num;
            }
        }
        return -1;
    }
}