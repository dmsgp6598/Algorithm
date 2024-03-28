import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        int cnt = 1;
        int num = 666;
        
        while(N != cnt) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        bf.close();
        System.out.println(num);
    }
}