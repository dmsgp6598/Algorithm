import java.util.HashMap;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i=0; i<numbers.length; i++) {
            hmap.put(numbers[i], i);
        }
        
        for(int i=1; i<=9; i++) {
            if(!hmap.containsKey(i)) {
                answer += i;
            }
        }
        
        return answer;
    }
}