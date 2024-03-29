import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=N; i++) {
            q.add(i);
        }
        
        sb.append('<');
        while(q.size() > 1) {
            for(int i=1; i<K; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        
        bf.close();
        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}