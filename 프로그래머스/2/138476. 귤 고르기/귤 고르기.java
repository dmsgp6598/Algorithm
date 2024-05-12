import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) +1);
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i=0; i<list.size(); i++) {
        	int value = list.get(i);
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