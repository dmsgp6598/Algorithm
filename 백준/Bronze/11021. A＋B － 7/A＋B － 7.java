import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=T; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            sb.append("Case #").append(i).append(": ")
                .append(Integer.parseInt(st.nextToken())
                +Integer.parseInt(st.nextToken())).append("\n");
        }
        
        bf.close();
        System.out.println(sb);
    }
}