import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        double[] arr = new double[N];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        double Max = arr[N-1];
        double sum = 0;
        double avg = 0;
        
        for(int j=0; j<N; j++) {
            arr[j] = (arr[j]/Max)*100;
            sum += arr[j];
        }
        
        avg = sum/N;
        System.out.println(avg);
        
        bf.close();
       
    }
}