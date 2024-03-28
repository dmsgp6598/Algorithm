import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        
        int sum = 0, min = 0;
        
        for(int i=M; i<=N; i++) {
        	boolean primeNum = true;
            if(i == 1) {
            	continue;
            }
            
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i % j == 0) {
                	primeNum = false;
                    break;
                }
            }
            
            if(primeNum) {
            	sum += i;
            	if(min == 0) min = i;
            	else min = Math.min(min, i);
            }
            
        }
        if(sum == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + min); 
    }
}