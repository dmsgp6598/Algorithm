import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] arr = new boolean[246913]; 
        
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        get_prime();
        
        while(true) {
            int num = Integer.parseInt(bf.readLine());
            if(num == 0) break;
            
            int cnt = 0;
            
            for(int i = num+1; i <= 2*num; i++) {
                if(!arr[i]) cnt++;
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