class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int cnt = brown + yellow;
        
        for(int i=3; i<=cnt; i++) {
            int col = i;
            int row = cnt / col;
            
            if(row < 3) continue;
            
            if(row >= col) {
                if((row-2) * (col-2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        
        return answer;
    }
}