import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        while(N != 0) {
            if(N % B >= 10) sb.append((char)((N % B) + 'A' - 10 ));
            else sb.append(N % B);
            N = N / B;
        }
        bf.close();
        System.out.print(sb.reverse().toString());
    }
}