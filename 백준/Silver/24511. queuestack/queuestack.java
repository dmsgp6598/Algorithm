import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(arr[i] == 0) dq.offer(num);
        }
        
        int X = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<X; i++) {
            dq.offerFirst(Integer.parseInt(st.nextToken()));
            sb.append(dq.pollLast()).append(" ");
        }
        
        bf.close();
        System.out.println(sb);
    }
}