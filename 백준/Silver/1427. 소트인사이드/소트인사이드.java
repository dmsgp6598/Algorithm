import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] cntSort = new int[10];
        String str = bf.readLine();
        
        for(int i=0; i<str.length(); i++) {
            cntSort[str.charAt(i) - '0']++;
        }
        
        for(int i=9; i>=0; i--) {
            while (cntSort[i]-- > 0) {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}