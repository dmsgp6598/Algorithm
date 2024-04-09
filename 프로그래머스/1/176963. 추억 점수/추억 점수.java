import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            int num = 0;
            for(int j=0; j<photo[i].length; j++) {
                num += map.get(photo[i][j]) == null ? 0 : map.get(photo[i][j]);
            }
            answer[i] = num;
        }
        
        return answer;
    }
}