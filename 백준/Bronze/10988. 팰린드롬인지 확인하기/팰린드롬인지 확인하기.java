import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String S1 = bf.readLine();
        String S2 = new StringBuilder(S1).reverse().toString();
        
        if(S1.equals(S2)) System.out.println("1");
        else System.out.println("0");
        
        bf.close();
    }
}