class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            
        String[] arr = s.split(" ");
        
        for(String n : arr) {
            min = Math.min(min, Integer.parseInt(n));
            max = Math.max(max, Integer.parseInt(n));
        }
        
        return answer = min + " " + max;
    }
}