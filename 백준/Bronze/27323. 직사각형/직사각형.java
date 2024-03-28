import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        
        System.out.println(A*B);
    }
    
}