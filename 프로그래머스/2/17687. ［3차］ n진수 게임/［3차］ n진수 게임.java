class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder convert = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; convert.length() <= t*m; i++) {
            convert.append(Integer.toString(i, n));
        }
        
        for(int i=0; i<t; i++) {
        	answer.append(convert.charAt(p-1+i*m));
        }
        
        return answer.toString().toUpperCase();
    }
}