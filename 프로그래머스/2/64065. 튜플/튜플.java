import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
		
		s = s.substring(2, s.length()-2);
		String[] str = s.split("\\},\\{");

		Arrays.sort(str, (str1, str2) -> {
			return str1.length() - str2.length();
		});
		
		int[] answer = new int[str.length];
		int idx = 0;
		for(String x1 : str) {
			for(String x2 : x1.split(",")) {
				if(set.add(x2)) {
					answer[idx++] = Integer.parseInt(x2);
				}
			}
		}
        return answer;
    }
}