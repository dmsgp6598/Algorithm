import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int val = 1;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == val) {
                val++;
            }else {
                if(!stack.isEmpty() && stack.peek() == val) {
                    stack.pop();
                    i--;
                    val++;
                }else {
                    stack.push(arr[i]);
                }
            }
        }
        
        boolean result = true;
        
        for(int i=0; i<stack.size(); i++) {
            int num = stack.pop();
            
            if(num == val) {
                val++;
            }else {
            	result = false;
                break;
            }
        }
        System.out.println(result ? "Nice" : "Sad");
        bf.close();
    }
}
