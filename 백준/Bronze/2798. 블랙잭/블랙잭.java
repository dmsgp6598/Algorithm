import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
    
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
    
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int tmp = 0;
        
        for(int i = 0; i < N-2; i++) {
            if(arr[i] > M) continue;
            
            for(int j = i+1; j < N-1; j++) {
                if(arr[i] + arr[j] > M) continue;
                
                for(int k = j+1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    
                    if(tmp < sum && sum <= M) {
                        tmp = sum;
                    }
                }
            }
        }
        bf.close();
        System.out.println(tmp);
    }
}

