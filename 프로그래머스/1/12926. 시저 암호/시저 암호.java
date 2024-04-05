class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if(c == ' ') answer += c;
            else if(c >= 'A' && c <= 'Z') {
                c += n;
                if(c > 90) c -= 26;
                answer += c;
            }else {
                c += n;
                if(c > 122) c-= 26;
                answer += c;
            }
    
        }
        
        
        return answer;
    }
}