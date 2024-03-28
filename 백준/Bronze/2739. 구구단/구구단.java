import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bf.readLine());
        
        for(int i=1; i<10; i++) {
            System.out.println(a+ " * " + i + " = " + a*i);
        }
        bf.close();
    }
}