import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int gcd = 0;
        
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        
        for(int i=0; i<N-1; i++) {
            int dis = arr[i+1] - arr[i]; //두 가로수 간격
            gcd = gcd(dis, gcd);//가로수 간격의 최대 공약수를 저장
        }
        
        System.out.println((arr[N-1] - arr[0])/gcd+1 - N);
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }

}