import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=N; i++) {
            for(int j=0; j<N-i; j++) {
                sb.append(" ");
            }
            for(int j=0; j<2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        for(int i=N-1; i>=0; i--) {
            for(int j=0; j<N-i; j++) {
                sb.append(" ");
            }
            for(int j=0; j<2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
        bf.close();
    }
}