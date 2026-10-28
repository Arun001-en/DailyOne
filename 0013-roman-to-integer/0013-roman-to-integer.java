class Solution {
    public int romanToInt(String s) {
        int sum= 0;
        for(int i =0;i < s.length();i++){
            int cur =0;
            char ch = s.charAt(i);
            if(ch=='I')
            cur = 1;
            if(ch=='V') 
            cur =5;
            if(ch=='X')
            cur = 10;
            if(ch=='L')
            cur = 50;
            if(ch=='C')
            cur = 100;
            if(ch=='D')
            cur =500;
            if(ch=='M')
            cur = 1000;
            if(i < s.length() - 1){
                int next = 0;
                if(s.charAt(i + 1) == 'I')
                    next = 1;
                if(s.charAt(i + 1) == 'V')
                    next = 5;
                if(s.charAt(i + 1) == 'X')
                    next = 10;
                if(s.charAt(i + 1) == 'L')
                    next = 50;
                if(s.charAt(i + 1) == 'C')
                    next = 100;
                if(s.charAt(i + 1) == 'D')
                    next = 500;
                if(s.charAt(i + 1) == 'M')
                    next = 1000;
                if(cur < next)
                    sum -= cur;
                else
                    sum += cur;
            }
            else{
                sum+=cur;

            }
        }
        return sum;
    }
}
