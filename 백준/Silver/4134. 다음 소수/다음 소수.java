import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<N; i++){
            long num = Long.parseLong(bf.readLine());
            
            if(num <= 2) {
                sb.append(2).append('\n');
                continue;
            }
                
            while(true) {
                boolean primeNum = true;
                
                for(int j=2; j<=Math.sqrt(num); j++) {
                    if(num % j == 0) {
                        primeNum = false;
                        break;
                    } 
                }
                
                if(primeNum) {
                    sb.append(num).append('\n');
                    break;
                }
                num++;
            }
        }
        bf.close();
        System.out.println(sb);
    }
}