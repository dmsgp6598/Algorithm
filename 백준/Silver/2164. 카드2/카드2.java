import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=1; i<=N; i++) {
            q.offer(i);
        }
        
        while(q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }
        
        bf.close();
        System.out.println(q.poll());
    }
}