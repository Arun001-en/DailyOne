class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i = 0 ; i<score.length ; i++){
            for(int j = i+1 ; j<score.length ; j++){
                if(score[i][k]<score[j][k]){
                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] =temp;
                }
            }
        }
        return score;
    }
}