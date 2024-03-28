import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            
            for(int j=0; j<S.length(); j++) {
                for(int k=0; k<R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            sb.append("\n");  
        }
        System.out.println(sb);
        bf.close();
    }
}