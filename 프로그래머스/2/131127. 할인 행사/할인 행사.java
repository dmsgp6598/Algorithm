
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
		int days = 10;
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<want.length; i++) {
			hmap.put(want[i], number[i]);
		}
		
		for(int i=0; i<discount.length - days + 1; i++) {
			HashMap<String, Integer> dmap = new HashMap<>();
			
			for(int j=0; j<days; j++) {
				dmap.put(discount[i + j], dmap.getOrDefault(discount[i + j], 0)+1);
			}
			
			Boolean chk = true;
			
			for(String key : dmap.keySet()) {
				if(hmap.get(key) != dmap.get(key)) {
					chk = false;
					break;
				}
			}
			answer += chk ? 1 :0;
		}
		
        return answer;
    }
}