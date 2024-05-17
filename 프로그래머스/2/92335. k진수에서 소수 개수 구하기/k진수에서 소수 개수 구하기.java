class Solution {
    public int solution(int n, int k) {
		int answer = 0;
		String num = Integer.toString(n, k);
		
		for(String str : num.split("0")) {
            if(str.equals("")) continue;
			if(isPrime(str) == false) {
				answer++;
			}
		}	
		return answer;
	}
    
    public boolean isPrime(String st) {
		Long n = Long.parseLong(st);
		
		if(n <= 1) return true;
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) return true;
		}
		return false;
	}
}