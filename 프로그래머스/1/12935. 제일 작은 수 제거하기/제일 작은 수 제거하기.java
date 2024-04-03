import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            if(min > num) min = num;
        }
        
        int[] newArr = new int[arr.length-1];
        int idx = 0;
        for(int num : arr) {
            if(num != min) newArr[idx++] = num;
        }
        
        return newArr;
    }
}