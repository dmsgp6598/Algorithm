import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> keypad = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if(keypad.containsKey(c)) {
                    int idx = keypad.get(c);
                    keypad.put(c, Math.min(idx, j+1));
                }else {
                    keypad.put(c, j+1);
                }
            }
        }
        
        for(int i=0; i<targets.length; i++){
            String target = targets[i];
            int cnt = 0;
            boolean result = true;
            for(char c : target.toCharArray()) {
                if(keypad.containsKey(c)) {
                    cnt += keypad.get(c);
                }else {
                    result = false;
                }
            }
            answer[i] = result == false ? -1 : cnt; 
        }
        
        return answer;
    }
}