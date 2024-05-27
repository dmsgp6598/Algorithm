class Solution {
    static int cnt = 0;
	
	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0, 0);
        return cnt;
    }
	
	public static void dfs(int[] numbers, int target, int sum, int depth) {
		if(depth == numbers.length) {
			if(target == sum) cnt++;
			return;
		}
		
		int plus = sum + numbers[depth];
		int minus = sum - numbers[depth];
		
		dfs(numbers, target, plus, depth+1);
		dfs(numbers, target, minus, depth+1);
	}
    
    
}