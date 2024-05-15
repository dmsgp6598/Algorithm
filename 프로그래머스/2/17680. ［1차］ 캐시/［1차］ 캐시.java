import java.util.List;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        List<String> list = new LinkedList<>();
        for(int i=0; i<cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if(!list.contains(city)) {
                if(cacheSize <= list.size()) {
                    list.remove(0);
                }
                list.add(city);
                answer += 5;
            }else {
                list.remove(city);
                list.add(city);
                answer += 1;
            }
            
        }
        
        return answer;
    }
}