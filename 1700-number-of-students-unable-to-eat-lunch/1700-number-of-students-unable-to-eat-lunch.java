class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int s : students){
            q.add(s);
        }
        int i = 0;
        int c = 0;
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                c = 0;
            }
            else{
                q.add(q.poll());
                c++;
            }
            if(c==q.size()){
                break;
            }
        }
        return q.size();
    }
}