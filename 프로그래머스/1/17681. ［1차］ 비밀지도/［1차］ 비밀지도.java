class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String binary = Integer.toString(arr1[i] | arr2[i], 2);
            binary = String.format("%" + n + "s", binary);
            binary = binary.replace("0", " ").replace("1", "#");
            answer[i] = binary;
            
        }
        
        return answer;
    }
}