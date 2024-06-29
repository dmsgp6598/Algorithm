import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        while(T-- > 0) {
            int N = Integer.parseInt(st.nextToken());
            max = Math.max(max, N);
            min = Math.min(min, N);
        }
        
        System.out.println(min * max);
        
    }
}