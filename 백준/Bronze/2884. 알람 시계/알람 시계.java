import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if(M>=45){
            System.out.println(H + " " + (M-45));
        }else {
            if(H==0) H = 23;
            else H = H-1;
            
            M = 60+(M-45);
            System.out.println(H + " " + M);
        }
        
        bf.close();
    }
}