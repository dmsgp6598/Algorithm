import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put(words[0], 0);
        for(int i=1; i<words.length; i++) {
            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }else if(map.containsKey(words[i])) {
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }else {
                answer[0] = 0;
                answer[1] = 0;
            }
            map.put(words[i], i);
        }

        return answer;
    }
}