import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        for(int i=0; i<sizes.length; i++){
          int num1 = Math.max(sizes[i][0],sizes[i][1]);
          int num2 = Math.min(sizes[i][0],sizes[i][1]);
          width = Math.max(width,num1);
          height = Math.max(height,num2);  
                
        }
        return answer=width*height;
    }
    
    
}