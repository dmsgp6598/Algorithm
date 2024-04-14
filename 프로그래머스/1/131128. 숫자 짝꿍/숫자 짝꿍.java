import java.util.HashMap;

class Solution {
    public String solution(String X, String Y) {
        
        HashMap<Integer, Integer> xMap = new HashMap<>();
        HashMap<Integer, Integer> yMap = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : X.split("")) {
            int cur = Integer.parseInt(str);
            xMap.put(cur, xMap.getOrDefault(cur, 0) + 1);
        }
        
        for(String str : Y.split("")) {
            int cur = Integer.parseInt(str);
            yMap.put(cur, yMap.getOrDefault(cur, 0) + 1);
        }
        
        
        for(int i=9; i>=0; i--) {
            if(xMap.containsKey(i) && yMap.containsKey(i)) {
                int cnt = Math.min(xMap.get(i), yMap.get(i));
                for(int j=0; j<cnt; j++) {
                    sb.append(i);
                }
            }
        }
        
        if(sb.toString().startsWith("0")) return "0";
        else if(sb.toString().equals("")) return "-1";
        else return sb.toString();
        
    }
}