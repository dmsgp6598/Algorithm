class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(get_prime(nums[i] + nums[j] + nums[k])) {
                       answer++; 
                    }
                }
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    
    private static boolean get_prime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i ==0) return false;
        }
        return true;
    }
}