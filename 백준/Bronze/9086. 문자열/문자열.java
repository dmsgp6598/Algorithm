import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<T; i++) {
            String st = bf.readLine();
            System.out.print(st.charAt(0));
            System.out.println(st.charAt(st.length()-1));
        }
        
        bf.close();
    }
}