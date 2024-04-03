import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> alist = new ArrayList<>();

        for(int num : arr) {
            if(num % divisor == 0) {
                alist.add(num);
            }
        }
        
        if(alist.size() == 0) {
            answer = new int[]{-1};
        }else {
            answer = new int[alist.size()];
            for(int i=0; i<alist.size(); i++) {
                answer[i] = alist.get(i);
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}