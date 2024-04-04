class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int d = gcd(n, m);
        
        answer[0] = d;
        answer[1] = n*m/d;
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}