import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        
        while((str = bf.readLine()) != null) {
            
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
        bf.close();
    }
}