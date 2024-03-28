class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        
        boolean answer = true;
        
        int cnt_p = 0;
        int cnt_y = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) ==  'P') cnt_p++;
            else if(s.charAt(i) == 'Y') cnt_y++;
        }
        
        answer = (cnt_p == cnt_y) ? true : false;

        return answer;
    }
}