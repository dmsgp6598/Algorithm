import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int d = gcd(a, b);
            
            sb.append(a*b/d).append('\n');
        }
        bf.close();
        System.out.println(sb);
    }
    
    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a%b;
            
            a = b;
            b = r;
        }
        return a;
    }
}