import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int MaxA = -10000, MaxB = -10000, MinA = 10000, MinB = 10000;
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            MaxA = Math.max(MaxA, A);
            MaxB = Math.max(MaxB, B);
            MinA = Math.min(MinA, A);
            MinB = Math.min(MinB, B);
        }
        
        bf.close();
        System.out.println((MaxA - MinA) * (MaxB - MinB));
        
    }
}