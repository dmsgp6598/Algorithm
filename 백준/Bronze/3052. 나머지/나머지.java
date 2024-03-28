import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] arr = new boolean[42];
        
        for(int i=0; i<10; i++) {
            arr[(Integer.parseInt(bf.readLine())) % 42] = true;
        }
        
        int cnt = 0;
        for(boolean val : arr) {
            if(val) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        bf.close();
    }
}