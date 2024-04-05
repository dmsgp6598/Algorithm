class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        //3진법으로 먼저 변환
        while(n != 0) {
            sb.append(n % 3);
            n = n/3;
        }
        
        String str = sb.toString();
        int num = 0, idx = 0;
        
        for(int i=str.length()-1; i>=0; i--) {
            char C = str.charAt(i);
            
            num = C - '0';
            
            answer += num * Math.pow(3, idx++);
        }
        
        return answer;
    }
}