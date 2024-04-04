import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        System.out.println(binomial(N,K));
    }
    
    public static int binomial(int N, int K) {
        return factorial(N)/(factorial(K) * factorial(N-K)); 
    }
    
    public static int factorial(int n) {
        if(n<=1) return 1;
        return n * factorial(n-1);
    }
}