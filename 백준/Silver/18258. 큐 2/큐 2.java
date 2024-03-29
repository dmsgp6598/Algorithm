import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[] q = new int[2000000];
    
    static int size = 0;
    static int front = 0;
    static int back = 0;
    
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        
        while(N-- > 0) {
            st = new StringTokenizer(bf.readLine(), " ");
            switch(st.nextToken()) {
                case "push" : push(Integer.parseInt(st.nextToken())); break;
                case "pop" : pop(); break;
                case "size" : size(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }
        bf.close();
        System.out.println(sb);
    }
    
    static void push(int n) {
        q[back] = n;
        size++;
        back++;
    }
    
    static void pop() {
        if(size == 0) {
            sb.append(-1).append("\n");
        }else {
            sb.append(q[front]).append("\n");
            front++;
            size--;
        }
    }
    
    static void size() {
        sb.append(size).append("\n");
    }
    
    static void empty() {
        if(size == 0) {
            sb.append(1).append("\n");
        }else {
            sb.append(0).append("\n");
        }
    }
    
    static void front() {
        if(size == 0) {
            sb.append(-1).append("\n");
        }else {
            sb.append(q[front]).append("\n");
        }
    }
    
    static void back() {
        if(size == 0) {
            sb.append(-1).append("\n");
        }else {
            sb.append(q[back -1]).append("\n");
        }
    }
}