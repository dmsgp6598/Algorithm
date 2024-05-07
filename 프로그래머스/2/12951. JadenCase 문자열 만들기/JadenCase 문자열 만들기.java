class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
		
		for(String str : arr) {
            if(str.length() == 0) {
    			sb.append(" ");
    		} else {
                sb.append(str.substring(0, 1).toUpperCase());
			    sb.append(str.substring(1, str.length()).toLowerCase());
			    sb.append(" ");
            }
		}
        
        if(s.substring(s.length()-1, s.length()).equals(" ")) {
            return sb.toString();
        } else {
            return sb.toString().substring(0, sb.length()-1);
        }
        
    }
}