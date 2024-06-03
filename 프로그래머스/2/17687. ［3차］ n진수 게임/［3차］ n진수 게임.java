class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder convert = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int num = 0;
        while(convert.length() < t * m) {
        	convert.append(Integer.toString(num++, n));
        }
        
        for(int i=0; i<t; i++) {
        	answer.append(convert.charAt(p-1+i*m));
        }
        
        return answer.toString().toUpperCase();
    }
}