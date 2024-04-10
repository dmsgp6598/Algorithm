import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int n : nums){
            if(!list.contains(n)){
                list.add(n);
            }
        }

        return nums.length/2 > list.size()?list.size():nums.length/2;
    }
}