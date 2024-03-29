import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(bf.readLine());
        int[] arr = new int[K];
        int top = -1;
        int sum = 0;
        
        for(int i=0; i<K; i++) {
            int N = Integer.parseInt(bf.readLine());
            if(N == 0) top--;
            else {
            	top++;
            	arr[top] = N;
            }
        }
        
        for(int i=0; i<=top; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
