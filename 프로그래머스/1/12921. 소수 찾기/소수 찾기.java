class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=3; i<=n; i++) {
            if(get_prime(i)) answer++;
        }
        
        return answer;
    }
    
    private boolean get_prime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
        
    }        
}