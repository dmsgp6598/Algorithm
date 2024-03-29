import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        int cnt = 1;
        
        for(int i=2; i*i <= N; i++) {
            cnt++;
        }
        
        bf.close();
        System.out.println(cnt);
    }
}