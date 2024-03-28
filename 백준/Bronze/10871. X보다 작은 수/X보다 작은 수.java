import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=0; i<N; i++) {
            int V = Integer.parseInt(st.nextToken());
            
            if(V < X) {
                sb.append(V + " ");
            }
        }
        
        System.out.println(sb);
        bf.close();
    }
}