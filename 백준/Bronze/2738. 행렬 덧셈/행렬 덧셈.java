import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<M; j++) {
                sb.append(arr[i][j] + Integer.parseInt(st.nextToken()) + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}