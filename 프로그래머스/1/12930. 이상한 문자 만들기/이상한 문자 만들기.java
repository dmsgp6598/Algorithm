import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int cnt = 0;
        String[] arr = s.split("");
        
        for(String str : arr) {
            cnt = str.contains(" ") ? 0 : cnt+1;
            answer += cnt%2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        
        return answer;
    }
}