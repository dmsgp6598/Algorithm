import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        
        int c = Integer.parseInt(bf.readLine());
        int n1 = Integer.parseInt(bf.readLine());
        
        if(a1*n1+a0 <= c*n1 && c>=a1) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        bf.close();
    }
}