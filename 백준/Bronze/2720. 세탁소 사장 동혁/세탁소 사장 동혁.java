import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<T; i++) {
            int C = Integer.parseInt(bf.readLine());
            
            int Q = C / 25; //Quarter $0.25
            sb.append(Q + " ");
            C %= 25;
            
            int D = C / 10; //Dime $0.10
            sb.append(D + " ");
            C %= 10;
            
            int N = C / 5; //Nickel $0.05
            sb.append(N + " ");
            C %= 5;
            
            int P = C;//Penny $0.01
            sb.append(P + "\n");
        }
        System.out.print(sb);
        bf.close();
    }
}