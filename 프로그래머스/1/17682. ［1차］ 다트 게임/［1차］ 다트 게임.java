class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] arr = dartResult.split("");
        int score[] = new int[3];
        
        int index = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].matches("[0-9]")) {
                index++;
                score[index] = Integer.parseInt(arr[i]);
                
                if(arr[i+1].matches("[0-9]")) {
                    score[index] *= 10;
                    i++;
                }
            }
            
            switch(arr[i]) {
                case "D" :
                    score[index] = (int)Math.pow(score[index],2);
                    break;
                case "T" :
                    score[index] = (int)Math.pow(score[index],3);
                    break;
                case "*" :
                    score[index] *= 2;
                    if(index-1 >= 0) score[index-1] *= 2;
                    break;
                case "#" :
                    score[index] *= -1;
                    break;
            }
        }
        
        for(int n : score) {
            answer += n;
        }
        
        return answer;
    }
}