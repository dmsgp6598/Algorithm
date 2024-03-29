import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int X = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<X; i++) {
            Stack<Character> stack = new Stack<>();
            String str = bf.readLine();
            String result = "";
            
            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);
                if(c == '(') {
                    stack.push(c);
                }else if(stack.isEmpty()){
                	result = "NO";
                }else {
                    stack.pop();
                }
            }
            if(result.equals("NO")) sb.append("NO").append('\n');
            else if(stack.isEmpty()) sb.append("YES").append('\n');
            else sb.append("NO").append('\n');
        }
        bf.close();
        System.out.println(sb);
    }
}