import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Balloon {
	int index;
	int value;
	
	public Balloon(int index, int value) {
		this.index = index;
		this.value = value;
	}
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<Balloon> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=1; i<=N; i++) {
        	dq.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }
        
        
        while(dq.size() > 1) {
        	Balloon b = dq.poll();
        	sb.append(b.index).append(" ");
        	int x = b.value;
        	
            if(x > 0) {
                for(int i=1; i<x; i++) {
                	dq.offer(dq.poll());
                }
            }else {
                for(int i=0; i<Math.abs(x); i++) {
                	dq.offerFirst(dq.pollLast());
                }
            }
            
        }
        Balloon m = dq.poll();
        sb.append(m.index);
        bf.close();
        System.out.println(sb);
    }
}