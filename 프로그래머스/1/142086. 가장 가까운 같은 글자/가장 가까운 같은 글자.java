class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        char[] ch = s.toCharArray();
        
        answer[0] = -1;
        
        for(int i=1; i<= s.length()-1; i++) {
            char c = ch[i];
            for(int j=i-1; j>=0; j--) {
                char c2 = ch[j];
                if(c == c2) {
                    answer[i] = i-j;
                    break;
                } 
                else answer[i] = -1;
            }
        }
        
        
        return answer;
    }
}