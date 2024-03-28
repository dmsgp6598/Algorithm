import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=T; i++) {
            String s = bf.readLine();
            int spaceIdx = s.indexOf(" ");
            int a = Integer.parseInt(s.substring(0, spaceIdx));
            int b = Integer.parseInt(s.substring(spaceIdx+1, s.length()));
            sb.append(a+b+"\n");
        }
        
        System.out.println(sb);
        bf.close();
    }
}