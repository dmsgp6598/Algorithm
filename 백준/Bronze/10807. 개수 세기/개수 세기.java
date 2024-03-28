import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");;
        int cnt = 0;
        
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int a = Integer.parseInt(bf.readLine());
        
        for(int j=0; j< arr.length; j++) {
            if(a == arr[j]) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        bf.close();
        
    }
}