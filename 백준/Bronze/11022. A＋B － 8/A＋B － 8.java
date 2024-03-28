import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=T; i++){
            String str = bf.readLine();
            int a = str.charAt(0)-'0';
            int b = str.charAt(2)-'0';
            
            sb.append("Case #").append(i).append(": ")
                .append(a).append(" + ").append(b)
                .append(" = ").append(a+b).append("\n");
        }
        
        bf.close();
        System.out.println(sb);
    }
}