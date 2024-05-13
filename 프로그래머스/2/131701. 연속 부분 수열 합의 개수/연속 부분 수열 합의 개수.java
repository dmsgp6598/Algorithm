import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> hset = new HashSet<>();
		
		int[] arr = new int[elements.length * 2];
		
		for(int i=0; i<elements.length; i++) {
			arr[i] = arr[i + elements.length] = elements[i];
		}
		
		for(int i=1; i<=elements.length; i++) {
			for(int j=0; j<elements.length; j++) {
				hset.add(Arrays.stream(arr, j , i+j).sum());
			}
		}
		
        return hset.size();
    }
}