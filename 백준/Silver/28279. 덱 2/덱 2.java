import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Deque<Integer> dq = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(N-- > 0) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            switch(x) {
                case 1 : 
                    dq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2 : 
                    dq.offer(Integer.parseInt(st.nextToken()));
                    break;
                case 3 : 
                    if(dq.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(dq.poll()).append('\n');
                    break;
                case 4 : 
                    if(dq.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(dq.pollLast()).append('\n');
                    break;
                case 5 :
                    sb.append(dq.size()).append('\n');
                    break;
                case 6 :
                    if(dq.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case 7 :
                    if(dq.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(dq.peek()).append('\n');
                    break;
                case 8 :
                    if(dq.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(dq.peekLast()).append('\n');
                    break;
            }
        }
        bf.close();
        System.out.println(sb);
    }
}