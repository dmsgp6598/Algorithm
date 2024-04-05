import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[30][30];
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            sb.append(combi(M,N)).append('\n');
        }
        System.out.println(sb);
    }
    
    public static int combi(int m, int n) {
        if(dp[m][n] > 0) return dp[m][n];
        
        if(m == n || n == 0) return 1;
        
        return dp[m][n] = combi(m-1, n-1) + combi(m-1, n);
    }
    
}