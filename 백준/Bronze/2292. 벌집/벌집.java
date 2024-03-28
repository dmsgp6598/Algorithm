import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        int num = 2;
        int cnt = 1;
            
        if(N == 1) {
            System.out.println(1);
        }else {
            while(num <= N) {
                num += (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
        bf.close();
    }
}