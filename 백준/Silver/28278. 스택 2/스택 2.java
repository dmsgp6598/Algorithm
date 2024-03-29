import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++) {
            String str = bf.readLine();
            st = new StringTokenizer(str);
            
            switch(st.nextToken()) {
                case "1" : 
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                	if(stack.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(stack.pop()).append("\n");
                    break;
                case "3" : 
                    sb.append(stack.size()).append("\n");
                    break;
                case "4" :
                	if(stack.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "5" :
                	if(stack.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        bf.close();
        System.out.println(sb);
    }
}