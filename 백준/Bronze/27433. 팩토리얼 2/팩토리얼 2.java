import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        
        System.out.println(factorial(N));
    }
    
    public static long factorial(int n) {
        if(n <= 1) return 1;
        return n*factorial(n-1);
    }
}