import java.util.PriorityQueue;

class Solution {
    public void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	
	public int solution(int[] scoville, int K) {
		int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length; i++) {
        	que.offer(scoville[i]);
        }
        
        while(que.size() > 1 && que.peek() < K) {
        	que.offer(que.remove() + que.remove() * 2);
        	answer++;
        }
		return que.peek() >= K ? answer : -1;
	}
}