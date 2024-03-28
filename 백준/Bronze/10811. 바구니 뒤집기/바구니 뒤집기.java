import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        
        for(int j=0; j<M; j++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;
            
            while(I < J) {
                int tmp = arr[I];
                arr[I] = arr[J];
                arr[J] = tmp;
                I++;
                J--;
            }
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
        bf.close();
    }
}