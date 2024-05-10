import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char ch : arr) {
			if(stack.isEmpty()) {
				stack.push(ch);
				continue;
			} else {
				if(stack.peek() == ch) stack.pop();
				else stack.push(ch);
			}
		}
        
        return stack.isEmpty() ? 1 : 0;
    }
}