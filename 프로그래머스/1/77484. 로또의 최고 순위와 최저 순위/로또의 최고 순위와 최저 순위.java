class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matchCnt = 0;
        
        for(int l : lottos) {
            if(l == 0) zeroCnt++;
            else {
                for(int w : win_nums) {
                    if(l == w) {
                        matchCnt++;
                    }
                }
            }
        }
        
        int max = matchCnt + zeroCnt;
        int min = matchCnt;
        
        int[] answer = {Math.min(7-max, 6), Math.min(7-min, 6)};
        
        return answer;
    }
}