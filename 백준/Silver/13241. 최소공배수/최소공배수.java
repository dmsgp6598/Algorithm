import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken()); 
        
        long d = gcd(A, B);
        
        System.out.println(A*B/d);
    }
    
    public static long gcd(long a, long b) {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }
}