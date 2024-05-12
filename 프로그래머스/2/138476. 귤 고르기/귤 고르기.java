import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : tangerine) {
            map.put(n, map.getOrDefault(n, 0) +1);
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(int value : list) {
        	if(value >= k) {
        		answer++;
        		break;
        	}else {
        		answer++;
        		k -= value;
        	}
        }
        
        return answer;
    }
}