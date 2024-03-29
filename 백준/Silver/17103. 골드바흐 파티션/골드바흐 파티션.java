import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] arr = new boolean[1000001]; 
        
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(bf.readLine());
        
        get_prime();
        
        while(T-- >0){
            int N = Integer.parseInt(bf.readLine());
            int cnt = 0;
            for(int i=2; i<=N/2; i++) {
                if(!arr[i] && !arr[N-i]) cnt++;
            }
            sb.append(cnt).append('\n');
        }
        
        bf.close();
        System.out.println(sb);
    }
    
    public static void get_prime() {
        //true = 소수가 아님, false = 소수
        arr[0] = arr[1] = true;
        
        for(int i=2; i<= Math.sqrt(arr.length); i++) {
            if(arr[i]) continue;
            for(int j=i+i; j<arr.length; j+=i) {
                arr[j] = true;
            }
        }
    }
}