import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		s = s.substring(2, s.length()-2);
		
		String[] str = s.split("\\},\\{");

		Arrays.sort(str, (str1, str2) -> {
			return str1.length() - str2.length();
		});
		
		for(String x : str) {
			String[] temp = x.split(",");
			for(int i=0; i<temp.length; i++) {
				int n = Integer.parseInt(temp[i]);
				if(!list.contains(n)) {
					list.add(n);
				}
			}
		}
		
		answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}