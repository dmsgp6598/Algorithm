import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        
        int result = 0;
            
        for(int i=1; i<=N; i++) {
            int num = i;
            int sum = 0;
            
            while(num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            
            if(sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}