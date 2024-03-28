import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bf.readLine());
        
        System.out.println(a-543);
        
        bf.close();
    }
}