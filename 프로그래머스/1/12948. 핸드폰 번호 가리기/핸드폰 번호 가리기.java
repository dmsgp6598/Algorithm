class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[phone_number.length()];
        
        for(int i=0; i<phone_number.length(); i++) {
            arr[i] = (i<phone_number.length()-4 ? '*' : phone_number.charAt(i));
        }
        
		for(char c : arr) {
			sb.append(c);
		}
        
        return sb.toString();
    }
}