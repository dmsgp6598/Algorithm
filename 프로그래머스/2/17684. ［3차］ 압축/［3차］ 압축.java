import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static int[] solution(String msg) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int idx = 1;
		for(char i='A'; i<='Z'; i++) {
			map.put(String.valueOf(i), idx++);
		}
        
		int size = msg.length();
        for(int i=0; i<size; i++) {
        	int len = 1;
        	while(i+len<=size && map.containsKey(msg.substring(i, i+len))) {
        		len++;
        	}
        	if(i+len > size) {
        		list.add(map.get(msg.substring(i)));
        		break;
        	}
        	list.add(map.get(msg.substring(i, i+len-1)));
        	map.put(msg.substring(i, i+len), idx++);
        	if(len>1) i+=len-2;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
	}
}