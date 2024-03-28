import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        
        int num = 0, sum = 0, idx = 0;
        
        for(int i=str.length()-1; i>=0; i--) {
            char C = str.charAt(i);
            
            if(C >= 'A' && C <= 'Z') {
                num = (C - 'A' + 10);
            }else {
                num = C - '0';
            }
            sum += num * Math.pow(N, idx++);
        }
        bf.close();
        System.out.println(sum);
    }
}