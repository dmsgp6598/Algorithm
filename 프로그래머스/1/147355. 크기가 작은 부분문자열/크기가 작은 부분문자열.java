class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tlen = t.length();
        int plen = p.length();
        long num = Long.parseLong(p);
        
        for(int i=0; i<tlen-plen+1; i++) {
            long diff = Long.parseLong(t.substring(i, i+plen));
            if(diff <= num) answer++;    
        }
        
        return answer;
    }
}