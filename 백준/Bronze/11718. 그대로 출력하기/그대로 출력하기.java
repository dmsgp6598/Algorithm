import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";
        
        while((s = bf.readLine()) != null) {
            sb.append(s + "\n");
        }
        
        bf.close();
        System.out.println(sb);
    }
}