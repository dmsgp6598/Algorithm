import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int num = 0;
        
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        
        for(int j=0; j<M; j++) {
            st = new StringTokenizer(bf.readLine(), " "); 
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            
            num = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = num;
        }
        
        for(int a : arr) {
            bw.write(a + " ");
        }
        
        bw.flush();
        bw.close();
        bf.close();
    }
}