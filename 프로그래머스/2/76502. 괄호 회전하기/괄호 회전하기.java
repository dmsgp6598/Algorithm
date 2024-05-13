import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
		
		Deque<Character> deque = new LinkedList<Character>();
		for(int i=0; i<s.length(); i++) {
			deque.offer(s.charAt(i));
		}
		
		for(int i=0; i<s.length(); i++) {
			deque.add(deque.poll());
			
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<s.length(); j++) {
				char c = deque.poll();
				deque.add(c);
				
				if(stack.isEmpty()) {
					stack.push(c);
				}else if(c == ']' && stack.peek() == '[') {
					stack.pop();
				}else if(c == '}' && stack.peek() == '{') {
					stack.pop();
				}else if(c == ')' && stack.peek() == '(') {
					stack.pop();
				}else {
					stack.push(c);
				}
			}
			
			if(stack.isEmpty()) answer++;
		}
		
        return answer;
    }
}