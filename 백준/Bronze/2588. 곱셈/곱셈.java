import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        
        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
        
        bf.close();
    }
}