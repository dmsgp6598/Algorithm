import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken()); //분수1의 분자
        int B = Integer.parseInt(st.nextToken()); //분수1의 분모
        
        st = new StringTokenizer(bf.readLine(), " ");
        int C = Integer.parseInt(st.nextToken()); //분수2의 분자
        int D = Integer.parseInt(st.nextToken()); //분수2의 분모
        
        int E = A * D + B * C;
        int F = B * D;
            
        int d = gcd(E, F); //최대공약수
        
        System.out.println(E/d + " " + F/d);
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }
}