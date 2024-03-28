import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringBuilder sb = new StringBuilder();
            
            int N = Integer.parseInt(bf.readLine());
            if(N == -1) break;
            
            int sum = 1;
            sb.append(N + " = 1");
            for(int i=2; i<N; i++) {
                if(N % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }
            
            if(sum != N) {
                System.out.println(N +" is NOT perfect.");
            }else {
                System.out.println(sb);
            }
        }
        bf.close();
    }
}