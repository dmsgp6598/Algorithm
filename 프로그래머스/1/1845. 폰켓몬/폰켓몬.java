import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        HashSet<Integer> hset = new HashSet<>();
        
        for(int n : nums) {
            hset.add(n);
        }
        
        if(max >= hset.size()) return hset.size();
        else return max;
        
    }
}